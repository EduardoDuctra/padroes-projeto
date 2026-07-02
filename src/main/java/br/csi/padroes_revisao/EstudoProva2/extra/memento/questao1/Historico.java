package br.csi.padroes_revisao.EstudoProva2.extra.memento.questao1;

import java.util.Stack;

public class Historico {

    private Stack<Memento> estados = new Stack<>();


    public void salvar(Memento m) {
        estados.push(m);
    }

    public Memento desfazer(){
        if(!estados.isEmpty()){
            return estados.pop();
        }

        return null;
    }
}
