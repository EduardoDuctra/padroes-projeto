package br.csi.padroes_revisao.EstudoProva2.extra.command.questao2.invoker;

import br.csi.padroes_revisao.EstudoProva2.extra.command.questao2.infra.Command;

public class EditorInvoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
