package br.csi.padroes_revisao.PADROES_CRIACAO.builder;

import br.csi.padroes_revisao.PADROES_CRIACAO.builder.construtor.CalzoneBuilder;
import br.csi.padroes_revisao.PADROES_CRIACAO.builder.construtor.PizzaBuilder;
import br.csi.padroes_revisao.PADROES_CRIACAO.builder.directors.RestauranteDirector;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        RestauranteDirector directory = new RestauranteDirector(pizzaBuilder);
        directory.prepararpizzaCalabresa();



        CalzoneBuilder calzoneBuilder = new CalzoneBuilder();

        directory = new RestauranteDirector(calzoneBuilder);
        directory.prepararpizzaCalabresa();


    }
}
