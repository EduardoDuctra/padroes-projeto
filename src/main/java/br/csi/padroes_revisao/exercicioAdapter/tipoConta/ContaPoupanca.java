package br.csi.padroes_revisao.exercicioAdapter.tipoConta;

import br.csi.padroes_revisao.exercicioAdapter.infra.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public double getIRPF() {
        return 0;
    }
}
