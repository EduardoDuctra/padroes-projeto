package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.chain;

import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.Autorizador;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.Reembolso;

import java.util.Random;

public class CEO extends Autorizador {

    private Random rand = new Random();

    public CEO(Autorizador proximoAutorizador) {
        super(proximoAutorizador);
    }

    @Override
    public boolean autoriza(Reembolso reembolso) {
        return rand.nextBoolean();
    }
}
