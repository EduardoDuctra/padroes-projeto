package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.chain;

import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.infra.LoanApprover;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class Diretor extends LoanApprover {

    public Diretor(LoanApprover next) {
        super(next);
    }

    @Override
    public void approve(double value) {
        if (value <= 100000) {
            System.out.println("Diretor aprovou.");
        } else {
            System.out.println("Empréstimo recusado.");
        }
    }
}
