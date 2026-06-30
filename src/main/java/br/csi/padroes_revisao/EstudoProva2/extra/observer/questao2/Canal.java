package br.csi.padroes_revisao.EstudoProva2.extra.observer.questao2;

import java.util.ArrayList;
import java.util.List;

public class Canal {

    List<Observer> inscritos = new ArrayList<Observer>();

    public void addInscritos(List<Observer> observers) {
        inscritos.addAll(observers);
    }

    private void notifyObservers(String video) {

        for (Observer observer : inscritos) {
            observer.update(video);
        }

    }

    public void publicarVideo(String video){

        System.out.println("Novo vídeo publicado: " + video);
        notifyObservers(video);
    }
}
