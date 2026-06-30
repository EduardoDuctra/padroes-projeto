package br.csi.padroes_revisao.EstudoProva2.extra.command.questao1;

import br.csi.padroes_revisao.EstudoProva2.extra.command.questao1.infra.Command;
import br.csi.padroes_revisao.EstudoProva2.extra.command.questao1.infra.Cozinha;

public class PreparePizzaCommand implements Command {

    private Cozinha cozinha;

    public PreparePizzaCommand(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public void execute() {
        cozinha.prepararPizza();
    }
}
