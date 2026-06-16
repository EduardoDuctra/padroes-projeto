package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.chain;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.Autorizador;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.Reembolso;

public class DiretorOperacoes extends Autorizador {
    @Override
    public void autorizar(Reembolso reembolso) {

        if(reembolso.getValor() <= 10000){
            System.out.println("Diretor Operações aprovou o reembolso"
                    + reembolso.getValor());
        } else if(proximo !=null){
            proximo.autorizar(reembolso);
        }
    }
}
