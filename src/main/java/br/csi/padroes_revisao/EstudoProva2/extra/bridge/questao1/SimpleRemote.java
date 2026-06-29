package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.infra.TV;

public class SimpleRemote extends Remote {

    public SimpleRemote(TV tv) {
        super(tv);
    }

    @Override
    public void power() {
        tv.on();
    }
}
