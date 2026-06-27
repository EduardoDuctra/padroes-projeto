package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.chain;

import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.Autorizador;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.Reembolso;

import java.util.Random;

public class SuporteTecnico extends Autorizador {

    private Random gerador = new Random();

    public SuporteTecnico(Autorizador proximoAutorizador) {
        super(proximoAutorizador);
    }


    @Override
    public boolean autoriza(Reembolso reembolso) {
        if(reembolso.getValorPedido() > 100){
            return getProximoAutorizador().autoriza(reembolso);
        } else{
            return gerador.nextBoolean();
        }
    }
}
