package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2;

import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.chain.Atendente;
import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.chain.Especialista;
import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.chain.Tecnico;
import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.infra.Suporte;

public class Main {
    public static void main(String[] args) {

        Suporte suporte =
                new Atendente(
                        new Tecnico(
                                new Especialista(null)));

        suporte.atender(1);
        suporte.atender(2);
        suporte.atender(3);
        suporte.atender(4);

    }
}
