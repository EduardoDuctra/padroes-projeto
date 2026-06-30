package br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1;

import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.chain.Diretor;
import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.chain.Gerente;
import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.chain.Supervisor;
import br.csi.padroes_revisao.EstudoProva2.extra.CoR.questao1.infra.LoanApprover;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor(null);
        Supervisor supervisor = new Supervisor(diretor);
        Gerente gerente = new Gerente(supervisor);

        List<LoanApprover> lista = Arrays.asList(
                gerente,
                supervisor,
                diretor);

        lista.get(0).approve(3000);
        lista.get(0).approve(15000);
        lista.get(0).approve(70000);
        lista.get(0).approve(150000);
    }
}
