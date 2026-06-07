package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.infra.Conta;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.infra.TipoConta;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class LogBancoDecorator implements BancoInterface{

    private BancoInterface banco;
    private FileWriter fw = new FileWriter("log.txt");

    public LogBancoDecorator (Banco banco) throws IOException {
        this.banco = banco;
    }

    private void escreveLog(String log) {

        try {
            fw.write("[BANCO]" + new Date() + ": " + log + "\n");
            fw.flush();
        } catch (IOException e) {}

    }



    @Override
    public Conta criarConta(String cpf, Double saldo, TipoConta tipo, boolean especial, Double limite) {
       escreveLog("criar conta - " + cpf);
       return banco.criarConta(cpf, saldo, tipo, especial, limite);
    }

    @Override
    public void excluirConta(Long numeroConta) {
        escreveLog("excluiContaBancaria: " + numeroConta);
        banco.excluirConta(numeroConta);
    }

    @Override
    public void saque(Long numeroConta, double valor) {
        escreveLog("saque: " + numeroConta + " - R$" + valor);
        banco.saque(numeroConta, valor);
    }

    @Override
    public void deposito(Long numeroConta, double valor) {
        escreveLog("deposito: " + numeroConta + " R$" + valor);
        banco.deposito(numeroConta, valor);
    }

    @Override
    public Double getSaldo(Long numeroConta) {
        escreveLog("getSaldo: " + numeroConta);
        return banco.getSaldo(numeroConta);
    }

    @Override
    public void transferencia(Long numeroContaOrigem, Long numeroContaDestino, double valor) {
        escreveLog("transferir: " + numeroContaOrigem + " - " + numeroContaDestino);
        banco.transferencia(numeroContaOrigem, numeroContaDestino, valor);
    }

    @Override
    public String extrato(Long numeroConta) {
        escreveLog("extrato: " + numeroConta);
        return banco.extrato(numeroConta);
    }

    @Override
    public void calcularRendimentos(double jurosPoupanca, double jurosRenda) {

    }

    @Override
    public Collection<Conta> getContas() {
        return List.of();
    }
}
