package br.csi.padroes_revisao.EstudoProva2.extra.memento.questao2;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Checkpoint> checkpoints = new ArrayList<Checkpoint>();

    public void salvar(Checkpoint checkpoint) {
        checkpoints.add(checkpoint);
    }

    public Checkpoint getCheckpoint(int indice) {
        return checkpoints.get(indice);
    }


}
