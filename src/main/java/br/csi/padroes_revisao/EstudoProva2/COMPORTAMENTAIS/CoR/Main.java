package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR;

import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.chain.CEO;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.chain.DiretorOperacoes;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.chain.GerenteSuporte;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR.chain.SuporteTecnico;

public class Main {
    public static void main(String[] args) {

        CEO ceo = new CEO(null);
        DiretorOperacoes diretor = new DiretorOperacoes(ceo);
        GerenteSuporte gerente = new GerenteSuporte(diretor);
        SuporteTecnico sup = new SuporteTecnico(gerente);


        Reembolso re1 = new Reembolso(10.0, "Reembolso 1");
        Reembolso re2 = new Reembolso(9_000.0, "Reembolso 2");
        Reembolso re3 = new Reembolso(100000000.0, "Reembolso 3");
        Reembolso re4 = new Reembolso(200.0, "Reembolso 4");


        Autorizador cadeia = sup;

        System.out.println("RE1=" + cadeia.autoriza(re1));
        System.out.println("RE2=" + cadeia.autoriza(re2));
        System.out.println("RE3=" + cadeia.autoriza(re3));
        System.out.println("RE4=" + cadeia.autoriza(re4));
    }
}
