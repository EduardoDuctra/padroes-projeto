package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.chain;

import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.infra.LoanApprover;

public class Gerente extends LoanApprover {

    public Gerente(LoanApprover next) {
        super(next);
    }

    @Override
    public void approve(double value) {
        if(value <= 5000){
            System.out.println("Gerente aprovou.");
        } else if(next != null){
            next.approve(value);
        }
    }
}
