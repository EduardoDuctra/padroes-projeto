package br.csi.padroes_revisao.EstudoProva2.extra.composite.questao1;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void show();

}