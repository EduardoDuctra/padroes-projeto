package br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.tipoConta;

import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public double getIRPF() {
        return 0;
    }
}
