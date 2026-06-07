package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.tipoConta;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.infra.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public double getIRPF() {
        return 0;
    }
}
