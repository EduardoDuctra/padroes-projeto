package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer;

public interface Observable {

    void adicionarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers();

}
