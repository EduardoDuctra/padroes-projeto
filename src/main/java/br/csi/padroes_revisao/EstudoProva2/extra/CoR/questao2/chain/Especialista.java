package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.chain;

import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.infra.Suporte;

public class Especialista extends Suporte {

    public Especialista(Suporte next) {
        super(next);
    }

    @Override
    public void atender(int nivel) {

        if(nivel == 3){
            System.out.println("Especialista resolveu o chamado.");
        }else {
            System.out.println("Chamado não pôde ser resolvido.");
        }

    }
}
