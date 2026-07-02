package br.csi.padroes_revisao.EstudoProva2.extra.memento.questao1;

import lombok.Data;

@Data
public class Editor {

    String texto;

    public void escrever(String texto) {
        this.texto = texto;
    }

    public Memento salvar(){
        return new Memento(texto);
    }

    public void restaurar(Memento m){
        this.texto = m.getTexto();
    }
}
