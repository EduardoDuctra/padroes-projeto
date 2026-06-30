package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.infra;

public abstract class Suporte {

    protected Suporte next;

    public Suporte(Suporte next) {
        this.next = next;
    }

    public abstract void atender(int nivel);
}
