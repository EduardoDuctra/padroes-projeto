package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR;

public abstract class Autorizador {

    protected Autorizador proximo;

    public void setProximo(Autorizador proximo) {
        this.proximo = proximo;
    }

    public abstract void autorizar(Reembolso reembolso);

}