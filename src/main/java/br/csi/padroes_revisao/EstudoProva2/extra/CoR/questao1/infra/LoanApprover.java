package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.infra;

public abstract class LoanApprover {

    protected LoanApprover next;

    public LoanApprover(LoanApprover next) {
        this.next = next;
    }

    public abstract void approve(double value);
}
