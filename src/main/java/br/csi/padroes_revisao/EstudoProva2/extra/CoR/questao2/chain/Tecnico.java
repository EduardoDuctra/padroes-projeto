package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.chain;

import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.infra.Suporte;

public class Tecnico extends Suporte {

    public Tecnico(Suporte next) {
        super(next);
    }

    @Override
    public void atender(int nivel) {

        if(nivel == 2){
            System.out.println("Tecnico resolveu o chamado.");
        }else if(next != null){
            next.atender(nivel);
        }

    }
}
