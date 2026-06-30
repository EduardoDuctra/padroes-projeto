package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.chain;

import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.infra.LoanApprover;

public class Supervisor extends LoanApprover {

    public Supervisor(LoanApprover next) {
        super(next);
    }

    @Override
    public void approve(double value) {
        if(value <= 20000){
            System.out.println("Supervisor aprovou.");
        } else if (next != null){
            next.approve(value);
        }
    }
}
