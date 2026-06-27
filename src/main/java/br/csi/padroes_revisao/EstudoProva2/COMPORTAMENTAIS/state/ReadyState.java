package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.state;

public class ReadyState implements PlayerState{
    @Override
    public PlayerState play() {
        System.out.println("play");
        return new PlayingState();
    }

    @Override
    public PlayerState previous() {
        System.out.println("previous");
        return this;
    }

    @Override
    public PlayerState next() {
        System.out.println("next");
        return this;
    }

    @Override
    public PlayerState lock() {
        System.out.println("lock");
        return new LockedState(this);
    }
}
