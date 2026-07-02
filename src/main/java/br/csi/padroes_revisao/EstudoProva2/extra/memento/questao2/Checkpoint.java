package br.csi.padroes_revisao.EstudoProva2.extra.memento.questao2;

import lombok.Data;

@Data
public class Checkpoint {

    private int x;
    private int y;

    public Checkpoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
