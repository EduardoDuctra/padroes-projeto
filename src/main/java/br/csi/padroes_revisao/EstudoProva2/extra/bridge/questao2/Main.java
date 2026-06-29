package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.cores.BlueColor;
import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.cores.RedColor;
import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.formas.Circle;
import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.formas.Rectangle;
import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.infra.Shape;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(new RedColor());
        Shape s2 = new Circle(new BlueColor());

        Shape s3 = new Rectangle(new RedColor());
        Shape s4 = new Rectangle(new BlueColor());

        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
    }
}
