package br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1;

import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.tvs.LGTV;
import br.csi.padroes_revisao.EstudoProva2.extra.bridge.questao1.tvs.SamsungTV;

public class Main {
    public static void main(String[] args) {

        Remote controle1 = new SimpleRemote(new SamsungTV());
        Remote controle2 = new AdvancedRemote(new LGTV());

        controle1.power();
        controle2.power();

    }
}
