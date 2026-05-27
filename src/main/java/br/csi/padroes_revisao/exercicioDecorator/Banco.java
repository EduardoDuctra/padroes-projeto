package br.csi.padroes_revisao.exercicioDecorator;

import br.csi.padroes_revisao.exercicioDecorator.infra.*;
import br.csi.padroes_revisao.exercicioDecorator.tipoConta.ContaCorrente;
import br.csi.padroes_revisao.exercicioDecorator.tipoConta.ContaPoupanca;
import br.csi.padroes_revisao.exercicioDecorator.tipoConta.FundoRenda;

import java.util.Collection;
import java.util.Map;

public class Banco {

    private Map<Long, Conta> listaContas;
    private Long numero = 1L;

    public Banco(Map<Long, Conta> tipoMapa) {
        this.listaContas = tipoMapa;
    }

    private Long gerarNumeroConta(){
        synchronized (this){
            return numero++;
        }
    }

    public Conta criarConta(String cpf, Double saldo, TipoConta tipo, boolean especial, Double limite) {

        if(tipo == TipoConta.CONTA_CORRENTE){
            ContaCorrente cc = new ContaCorrente();
            cc.setCpf(cpf);
            cc.setSaldo(saldo);
            cc.setEspecial(especial);
            cc.setLimiteChequeEspecial(limite);
            cc.setTipoConta(tipo);
            cc.setNumeroConta(gerarNumeroConta());

            listaContas.put(cc.getNumeroConta(), cc);

            return cc;
        } else if (tipo == TipoConta.POUPANCA){
            ContaPoupanca cp =  new ContaPoupanca();
            cp.setCpf(cpf);
            cp.setSaldo(saldo);
            cp.setTipoConta(tipo);
            cp.setNumeroConta(gerarNumeroConta());

            listaContas.put(cp.getNumeroConta(), cp);

            return cp;

        } else {
            FundoRenda fr = new FundoRenda(tipo);
            fr.setCpf(cpf);
            fr.setSaldo(saldo);
            fr.setTipoConta(tipo);
            fr.setNumeroConta(gerarNumeroConta());

            listaContas.put(fr.getNumeroConta(), fr);

            return fr;
        }

    }



    public void excluirConta(Long numeroConta){
        Conta conta = listaContas.remove(numeroConta);

        if(conta == null){
            throw new BancoException("Conta inexistente");
        }
    }


    public void saque(Long numeroConta, double valor){

        Conta conta = listaContas.get(numeroConta);

//        synchronized -> evitar concorrência
        synchronized (conta){

            Double limite = 0.0;

            if(conta == null){
                throw new BancoException("Conta inexistente");
            }

            if(conta instanceof ContaCorrente && ((ContaCorrente) conta).isEspecial()){
                limite = ((ContaCorrente) conta).getLimiteChequeEspecial();
            }

            if(valor>conta.getSaldo()+limite){
                throw new IllegalArgumentException("Saldo insuficiente");
            }

            conta.setSaldo(conta.getSaldo()-valor);
            Movimentacao m = new Movimentacao("Saque", valor, TipoMovimentacao.DEBITO);
            conta.getMovimentacoes().add(m);
        }


    }

    public void deposito(Long numeroConta, double valor){

        Conta conta = listaContas.get(numeroConta);
        //        synchronized -> evitar concorrência
        synchronized (conta){

            if(conta == null){
                throw new BancoException("Conta inexistente");
            }


            conta.setSaldo(conta.getSaldo()+valor);
            Movimentacao m = new Movimentacao("Depósito", valor, TipoMovimentacao.CREDITO);
            conta.getMovimentacoes().add(m);

        }

    }

    public Double getSaldo(Long numeroConta){

        Conta conta = listaContas.get(numeroConta);

        if(conta == null){
            throw new BancoException("Conta inexistente");
        }

        return conta.getSaldo();

    }


    public void transferencia(Long numeroContaOrigem, Long numeroContaDestino, double valor){

        Conta contaOrigem = listaContas.get(numeroContaOrigem);

        Conta contaDestino = listaContas.get(numeroContaDestino);



        if(contaOrigem == null || contaDestino == null){
            throw new BancoException("Conta inexistente");
        }

        synchronized (contaOrigem){
            synchronized (contaDestino){

                saque(numeroContaOrigem, valor);
                deposito(numeroContaDestino, valor);

            }
        }

    }

    public String extrato(Long numeroConta){

        Conta conta = listaContas.get(numeroConta);

        if(conta == null){
            throw new BancoException("Conta inexistente");
        }

        StringBuilder extrato = new StringBuilder();

        for(Movimentacao m : conta.getMovimentacoes()){
            extrato.append(m.getValor() + "\t" + m.getValor() + "\t" + m.getDescricao());
        }

        return extrato.toString();


    }

    public void calcularRendimentos(double jurosPoupanca, double jurosRenda){

        for(Conta conta : listaContas.values()){
            if(conta instanceof ContaPoupanca){
                double rendimento = conta.getSaldo() * (jurosPoupanca/100);
                conta.setSaldo(conta.getSaldo()+rendimento);

                Movimentacao m = new Movimentacao("Rendimento", rendimento, TipoMovimentacao.CREDITO);
                conta.getMovimentacoes().add(m);
            } else if(conta instanceof FundoRenda){
                double rendimento = conta.getSaldo() * (jurosRenda/100);
                conta.setSaldo(conta.getSaldo()+rendimento);

                Movimentacao m = new Movimentacao("Rendimento", rendimento, TipoMovimentacao.CREDITO);
                conta.getMovimentacoes().add(m);
            }
        }

    }

    public Collection<Conta> getContas() {
        return listaContas.values();
    }
}
