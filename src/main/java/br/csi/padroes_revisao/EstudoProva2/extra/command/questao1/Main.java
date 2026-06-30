package br.csi.padroes_revisao.EstudoProva2.extra.command.questao1;

import br.csi.padroes_revisao.EstudoProva2.extra.command.questao1.infra.Cozinha;
import br.csi.padroes_revisao.EstudoProva2.extra.command.questao1.invoker.Garcom;

public class Main {
    public static void main(String[] args) {

        Cozinha cozinha = new Cozinha();
        Garcom garcom = new Garcom();


        garcom.setCommand(new PreparePizzaCommand(cozinha));
        garcom.enviarPedido();




    }
}
