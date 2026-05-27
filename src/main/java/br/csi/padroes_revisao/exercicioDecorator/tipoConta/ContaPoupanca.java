package br.csi.padroes_revisao.exercicioDecorator.tipoConta;

import br.csi.padroes_revisao.exercicioDecorator.infra.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public double getIRPF() {
        return 0;
    }
}
