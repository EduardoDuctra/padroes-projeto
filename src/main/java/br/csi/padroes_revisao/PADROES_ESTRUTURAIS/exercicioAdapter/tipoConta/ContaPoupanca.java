package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.tipoConta;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public double getIRPF() {
        return 0;
    }
}
