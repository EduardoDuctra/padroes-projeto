package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.state;

public class LockedState implements PlayerState{

    private PlayerState estadoAnterior;

    public LockedState(PlayerState estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    @Override
    public PlayerState play() {
        System.out.println("locked");
        return this;
    }

    @Override
    public PlayerState previous() {
        System.out.println("locked");
        return this;
    }

    @Override
    public PlayerState next() {
        System.out.println("locked");
        return this;
    }

    /**
     * Playing
     *    |
     *  lock
     *    |
     * Locked ------ unlock ------> Playing
     * @return
     */
    @Override
    public PlayerState lock() {
        System.out.println("unlocked");
        return estadoAnterior;
    }
}
