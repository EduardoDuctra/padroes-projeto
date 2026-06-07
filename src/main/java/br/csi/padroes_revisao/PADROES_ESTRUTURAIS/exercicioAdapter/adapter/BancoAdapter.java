package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.adapter;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.Banco;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.Conta;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.TipoConta;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BancoAdapter implements BancoAntigo{

    private Banco banco;


    @Override
    public boolean removerConta(String codigo) {
        banco.excluirConta(Long.valueOf(codigo));

        return true;
    }

    @Override
    public void movimentar(String codigo, double valor) {

        if(valor>0){
            banco.deposito(Long.valueOf(codigo), valor);
        } else{
            banco.saque(Long.valueOf(codigo), valor);
        }

    }

    @Override
    public double verificarSaldo(String codigo) {
        return banco.getSaldo(Long.valueOf(codigo));
    }

    @Override
    public String imprimirExtrato(String codigo) {
        return banco.extrato(Long.valueOf(codigo));
    }

    @Override
    public void transfereEntreContas(String origem, String destino, double valor) {
        banco.transferencia(Long.valueOf(origem), Long.valueOf(destino), valor);
    }

    @Override
    public Conta novaConta(String tipo, double saldoInicial,
                           boolean vip, double limite) {

        TipoConta tipoConta;

        if(tipo.equalsIgnoreCase("corrente")) {

            tipoConta = TipoConta.CONTA_CORRENTE;

        } else if(tipo.equalsIgnoreCase("poupanca")) {

            tipoConta = TipoConta.POUPANCA;

        } else {

            tipoConta = TipoConta.RENDA_VARIAVEL;
        }

        return banco.criarConta("00000000000", saldoInicial,
                tipoConta, vip, limite);
    }
}
