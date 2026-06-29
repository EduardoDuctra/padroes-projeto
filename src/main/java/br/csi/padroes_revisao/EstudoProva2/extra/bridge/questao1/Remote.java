package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.infra.TV;

public abstract class Remote {

    protected TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public abstract void power();

}
