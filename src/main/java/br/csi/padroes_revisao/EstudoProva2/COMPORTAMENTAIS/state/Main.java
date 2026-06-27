package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.state;

public class Main {

    public static void main(String[] args) {

        AudioPlayer player = new AudioPlayer();

        player.play();      // Ready -> Playing
        player.next();      // continua Playing
        player.previous();  // continua Playing

        player.lock();      // Playing -> Locked

        /**
         * nao acotnece nada pq tá bloqueado
         */
        player.play();      // locked
        player.next();      // locked


        player.lock();      // Unlock -> volta para Playing

        /**
         * desbloqueei e agora acontece
         */


        player.play();      // pause -> Ready

        player.lock();      // Ready -> Locked
        player.lock();      // Unlock -> volta para Ready
    }
}