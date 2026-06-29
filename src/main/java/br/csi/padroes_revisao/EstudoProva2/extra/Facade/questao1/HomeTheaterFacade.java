package br.csi.padroes_revisao.EstudoProva2.extra.Facade.questao1;

public class HomeTheaterFacade {

    private Projetor projector;
    private SoundSystem soundSystem;
    private Curtains curtains;
    private MoviePlayer moviePlayer;

    public HomeTheaterFacade() {
        projector = new Projetor();
        soundSystem = new SoundSystem();
        curtains = new Curtains();
        moviePlayer = new MoviePlayer();
    }

    public void watchMovie(){
        projector.on();
        soundSystem.on();
        curtains.close();
        moviePlayer.play();

    }

}
