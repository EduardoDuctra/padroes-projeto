package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer.tipoConta;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer.infra.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public double getIRPF() {
        return 0;
    }
}
