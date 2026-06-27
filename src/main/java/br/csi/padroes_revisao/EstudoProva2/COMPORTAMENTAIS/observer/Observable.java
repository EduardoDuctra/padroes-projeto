package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.observer;

public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
}
