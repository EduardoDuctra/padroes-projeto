package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.infra.TV;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(TV tv) {
        super(tv);
    }

    @Override
    public void power() {
        tv.on();
        System.out.println("Modo avançado ativado.");
    }
}
