package br.csi.padroes_revisao.EstudoProva2.extra.memento.questao1;

import lombok.Data;

@Data
public class Memento {

    private String texto;

    public Memento(String texto) {
        this.texto = texto;
    }


}
