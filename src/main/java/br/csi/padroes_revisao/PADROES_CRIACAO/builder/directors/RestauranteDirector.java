package br.csi.padroes_revisao.PADROES_CRIACAO.builder.directors;

import br.csi.padroes_revisao.PADROES_CRIACAO.builder.interfaces.Builder;
import br.csi.padroes_revisao.PADROES_CRIACAO.builder.interfaces.Lanche;

public class RestauranteDirector {

    private Builder builder;

    public RestauranteDirector(Builder builder) {
        this.builder = builder;
    }

    public Lanche prepararpizzaCalabresa(){
        builder.prepararMassa();
        builder.colocarQueijo();
        builder.colocarCalabresa();
        builder.assar();

        return builder.build();
    }
}
