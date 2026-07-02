package br.csi.padroes_revisao.EstudoProva2.extra.memento.questao1;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
        Historico historico = new Historico();

        editor.escrever("Teste 1");
        historico.salvar(editor.salvar());

        editor.escrever("Teste 2");
        historico.salvar(editor.salvar());

        editor.escrever("Texto 3");

        System.out.println("Atual: " + editor.getTexto());

        Memento estadoAnterior = historico.desfazer();

        if (estadoAnterior != null) {
            editor.restaurar(estadoAnterior);
        }

        System.out.println("Depois do desfazer: " + editor.getTexto());

    }
}
