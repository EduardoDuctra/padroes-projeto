package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.tvs;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.infra.TV;

public class SamsungTV implements TV {

    @Override
    public void on() {
        System.out.println("Samsung ligada.");
    }

    @Override
    public void off() {
        System.out.println("Samsung desligada.");
    }
}
