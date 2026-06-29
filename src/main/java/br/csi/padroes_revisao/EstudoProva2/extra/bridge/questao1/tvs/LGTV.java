package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.tvs;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.infra.TV;

public class LGTV implements TV {

    @Override
    public void on() {
        System.out.println("LG ligada.");
    }

    @Override
    public void off() {
        System.out.println("LG desligada.");
    }
}
