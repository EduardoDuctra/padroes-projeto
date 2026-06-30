package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.chain;

import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao2.infra.Suporte;

public class Atendente extends Suporte {

    public Atendente(Suporte next) {
        super(next);
    }

    @Override
    public void atender(int nivel) {

        if(nivel == 1){
            System.out.println("Atendente resolveu o chamado.");
        }else if(next != null){
            next.atender(nivel);
        }

    }
}
