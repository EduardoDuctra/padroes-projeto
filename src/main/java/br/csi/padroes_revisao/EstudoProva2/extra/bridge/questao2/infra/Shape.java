package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.infra;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
