package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.formas;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.infra.Shape;
import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.infra.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Desenhando Círculo");
        color.applyColor();
    }
}
