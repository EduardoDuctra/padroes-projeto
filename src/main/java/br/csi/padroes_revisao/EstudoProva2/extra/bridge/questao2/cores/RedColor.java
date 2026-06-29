package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.cores;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao2.infra.Color;

public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Cor Vermelha");
    }
}
