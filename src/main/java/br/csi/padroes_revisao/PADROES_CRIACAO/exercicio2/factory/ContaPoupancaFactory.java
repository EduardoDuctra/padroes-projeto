package br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.factory;

import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.Conta;
import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.TipoConta;
import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.tipoConta.ContaPoupanca;

public class ContaPoupancaFactory extends ContaFactory{


    @Override
    public Conta criarConta(String cpf, Double saldo, boolean especial, Double limite) {

        ContaPoupanca cp = new ContaPoupanca();
        cp.setCpf(cpf);
        cp.setSaldo(saldo);
        cp.setTipoConta(TipoConta.POUPANCA);

        return cp;
    }
}
