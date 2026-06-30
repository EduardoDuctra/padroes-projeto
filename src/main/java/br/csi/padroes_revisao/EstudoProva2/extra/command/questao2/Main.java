package br.csi.padroes_revisao.EstudoProva2.extra.command.questao2;

import br.csi.padroes_revisao.EstudoProva2.extra.command.questao2.infra.TextEditor;
import br.csi.padroes_revisao.EstudoProva2.extra.command.questao2.invoker.EditorInvoker;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorInvoker invoker = new EditorInvoker();

        invoker.setCommand(new CopyCommand(editor));
        invoker.executeCommand();

        invoker.setCommand(new PasteCommand(editor));
        invoker.executeCommand();


    }
}
