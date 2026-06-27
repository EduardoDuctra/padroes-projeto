package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.state;


/**
 *               play
 * Ready -----------------> Playing
 *   ^                        |
 *   |                        |
 *   |-------- play ----------|
 *         (pause)
 *
 * Playing ---- next -------> Playing
 *
 * Playing ---- previous ---> Playing
 *
 * Playing ---- lock -------> Locked
 *                                |
 *                                |
 *                             unlock
 *                                |
 *                                v
 *                            Playing
 */
public class PlayingState implements PlayerState{

    /**
     * Quando a música já está tocando, apertar Play novamente significa Pausar.
     * @return
     */
    @Override
    public PlayerState play() {
        System.out.println("pause");
        return (PlayerState) new ReadyState();
    }

    @Override
    public PlayerState previous() {
        System.out.println("prev");
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
