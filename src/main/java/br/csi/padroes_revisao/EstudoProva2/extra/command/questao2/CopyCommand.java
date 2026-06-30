package br.csi.padroes_revisao.EstudoProva2.extra.command.questao2;

import br.csi.padroes_revisao.EstudoProva2.extra.command.questao2.infra.Command;
import br.csi.padroes_revisao.EstudoProva2.extra.command.questao2.infra.TextEditor;

public class CopyCommand implements Command {

    private TextEditor textEditor;

    public CopyCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.copy();
    }
}
