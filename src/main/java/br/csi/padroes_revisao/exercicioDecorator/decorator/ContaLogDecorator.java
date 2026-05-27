package br.csi.padroes_revisao.exercicioDecorator.decorator;

import br.csi.padroes_revisao.exercicioDecorator.infra.Conta;

/**
 * implementa a lógica
 *
 * recebe a conta real -> envia para o Decorator
 */
public class ContaLogDecorator extends ContaDecorator {

    public ContaLogDecorator(Conta conta) {
        super(conta);
    }

    @Override
    public double getIRPF() {

        gerarLogs("Calculando IRPF da conta " + conta.getNumeroConta());

        return conta.getIRPF();
    }
}
