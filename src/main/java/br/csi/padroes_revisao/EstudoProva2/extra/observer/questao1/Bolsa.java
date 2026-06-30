package br.csi.padroes_revisao.EstudoProva2.extra.observer.questao1;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {

    private List<Observer> observers = new ArrayList<Observer>();

    private double price;

    public void addObserver(List<Observer> observers) {
        this.observers.addAll(observers);
    }

    private void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(price);
        }

    }
    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
