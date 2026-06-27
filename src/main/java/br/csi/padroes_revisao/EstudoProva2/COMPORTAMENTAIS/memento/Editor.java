package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.memento;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Stack;

public class Editor {

    private JEditorPane jEditor;
    private Stack<EditorMemento> pilhaDesfazer = new Stack<>();
    private Stack<EditorMemento> pilhaRefazer = new Stack<>();


    private void onKeyPressed(KeyEvent e) {

        //se aprttou enter ou space executa o bloco
        if (e.getKeyCode() == KeyEvent.VK_ENTER ||
                e.getKeyCode() == KeyEvent.VK_SPACE) {

            //cria memento e guarda pilha desfazer
            EditorMemento memento = criaMemento();
            pilhaDesfazer.push(memento);
            pilhaRefazer.clear();


        }

        //se clicar control Z
        else if (e.getKeyCode() == KeyEvent.VK_Z &&
                e.getModifiers() == InputEvent.CTRL_DOWN_MASK) {

            // Verifica se existe algum estado anterior salvo
            if (!pilhaDesfazer.empty()) {

                // Recupera o último estado salvo
                EditorMemento memento = pilhaDesfazer.pop();

                // Salva o estado atual na pilha de refazer (Redo)
                pilhaRefazer.push(criaMemento());

                // Restaura o estado anterior do editor
                aplicaMemento(memento);
            }


        }


        //clicou Control+R -> refazer
        else if (e.getKeyCode() == KeyEvent.VK_R &&
                e.getModifiers() == InputEvent.CTRL_DOWN_MASK) {
            if (!pilhaRefazer.empty()) {

                //pega o ultimo estado salvo
                EditorMemento memento = pilhaRefazer.pop();

                //salva estado atual e restaura estado
                pilhaDesfazer.push(criaMemento());
                aplicaMemento(memento);
            }
        }


        else {
            pilhaRefazer.clear();
        }
    }

    //foto do estado
    private EditorMemento criaMemento() {
        return EditorMemento.builder().
                texto(jEditor.getText()).
                posicaoCursor(jEditor.getCaretPosition()).
                inicioSelecao(jEditor.getSelectionStart()).
                fimSelecao(jEditor.getSelectionEnd()).build();
    }

    private void aplicaMemento(EditorMemento memento) {
        jEditor.setText(memento.getTexto());
        jEditor.setCaretPosition(memento.getPosicaoCursor());
        jEditor.setSelectionStart(memento.getInicioSelecao());
        jEditor.setSelectionEnd(memento.getFimSelecao());
    }


}
