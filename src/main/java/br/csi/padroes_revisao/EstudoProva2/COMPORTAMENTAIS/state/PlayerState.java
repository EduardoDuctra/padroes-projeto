package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.state;

public interface PlayerState {

    PlayerState play();
    PlayerState previous();
    PlayerState next();
    PlayerState lock();


}
