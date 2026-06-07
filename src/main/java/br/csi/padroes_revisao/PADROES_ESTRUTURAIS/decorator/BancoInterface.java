package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.infra.Conta;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.infra.TipoConta;

import java.util.Collection;

public interface BancoInterface {
    
    Conta criarConta(String cpf, Double saldo, TipoConta tipo, boolean especial, Double limite);

    void excluirConta(Long numeroConta);

    void saque(Long numeroConta, double valor);

    void deposito(Long numeroConta, double valor);

    Double getSaldo(Long numeroConta);

    void transferencia(Long numeroContaOrigem, Long numeroContaDestino, double valor);

    String extrato(Long numeroConta);

    void calcularRendimentos(double jurosPoupanca, double jurosRenda);

    Collection<Conta> getContas();
}
