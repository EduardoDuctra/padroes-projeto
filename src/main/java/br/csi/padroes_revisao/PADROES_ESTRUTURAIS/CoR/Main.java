package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.chain.CEO;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.chain.DiretorOperacoes;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.chain.GerenteSuporte;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.CoR.chain.SuporteTecnico;

public class Main {
    public static void main(String[] args) {

        Autorizador suporte = new SuporteTecnico();
        Autorizador gerente = new GerenteSuporte();
        Autorizador diretor = new DiretorOperacoes();
        Autorizador ceo = new CEO();

        suporte.setProximo(gerente);
        gerente.setProximo(diretor);
        diretor.setProximo(ceo);

        Reembolso a = new Reembolso(50, "Reembolso 1");
        Reembolso b = new Reembolso(500, "Reembolso 2");
        Reembolso c = new Reembolso(5000, "Reembolso 3");
        Reembolso d = new Reembolso(50000, "Reembolso 4");


        suporte.autorizar(a);
        suporte.autorizar(b);
        suporte.autorizar(c);
        suporte.autorizar(d);

    }
}
