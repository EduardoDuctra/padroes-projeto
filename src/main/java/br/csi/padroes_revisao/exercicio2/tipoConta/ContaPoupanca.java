package br.csi.padroes_revisao.exercicio2.tipoConta;

import br.csi.padroes_revisao.exercicio2.infra.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public double getIRPF() {
        return 0;
    }
}
