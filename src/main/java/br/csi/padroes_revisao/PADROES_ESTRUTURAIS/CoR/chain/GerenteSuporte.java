package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.chain;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.Autorizador;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.Reembolso;

public class GerenteSuporte extends Autorizador {
    @Override
    public void autorizar(Reembolso reembolso) {
        if(reembolso.getValor() <= 100){
            System.out.println("Suporte técnico aprovou o reembolso"
                    + reembolso.getValor());
        } else if(proximo !=null){
            proximo.autorizar(reembolso);
        }
    }
}
