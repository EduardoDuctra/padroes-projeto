package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.state;

public class AudioPlayer {

    private PlayerState playerState = new ReadyState();

    public void play() {
        this.playerState = playerState.play();
    }

    public void previous() {
        this.playerState = playerState.previous();
    }

    public void next() {
        this.playerState = playerState.next();
    }

    public void lock() {
        this.playerState = playerState.lock();
    }

}
