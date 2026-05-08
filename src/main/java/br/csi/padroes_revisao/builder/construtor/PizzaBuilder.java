package br.csi.padroes_revisao.builder.construtor;

import br.csi.padroes_revisao.builder.classesConcretas.Pizza;
import br.csi.padroes_revisao.builder.interfaces.Builder;
import br.csi.padroes_revisao.builder.interfaces.Lanche;

public class PizzaBuilder implements Builder {

    private Pizza pizza;

    //inicializar
    @Override
    public void prepararMassa() {
        this.pizza = new Pizza();
        System.out.println("Preparando Massa - PIZZA ");
    }

    @Override
    public void colocarMolhoTomate() {
        System.out.println("Colocando molho");
    }

    @Override
    public void colocarQueijo() {
        System.out.println("Colocando queijo");
    }

    @Override
    public void colocarCalabresa() {
        System.out.println("Colocando calabresa");
    }

    @Override
    public void colocarMilho() {
        System.out.println("Colocando milho");

    }

    @Override
    public void assar() {

        if(pizza ==null){
            throw new IllegalArgumentException("Pizza vazia");
        }
        System.out.println("Assarando");

    }

    @Override
    public Lanche build() {

        if(pizza ==null){
            throw new IllegalArgumentException("Pizza vazia");
        }

        return pizza;
    }
}
