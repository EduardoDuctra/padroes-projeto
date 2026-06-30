package br.csi.padroes_revisao.EstudoProva2.extra.observer.questao1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bolsa bolsa = new Bolsa();

        List<Observer> investidores = new ArrayList<>();


        Investidor investidor1 = new Investidor("Joao");
        Investidor investidor2 = new Investidor("Ana");

        investidores.add(investidor1);
        investidores.add(investidor2);

        bolsa.addObserver(investidores);

        bolsa.setPrice(25);
    }
}
