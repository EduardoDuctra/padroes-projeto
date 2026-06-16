package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.chain;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.Autorizador;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.Reembolso;

public class CEO extends Autorizador {
    @Override
    public void autorizar(Reembolso reembolso) {
        System.out.println("CEO aprovou: R$ "
                + reembolso.getValor());
    }
}
