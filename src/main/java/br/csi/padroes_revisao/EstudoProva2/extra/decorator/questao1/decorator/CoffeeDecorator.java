package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1.decorator;

import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1.Coffe;

public abstract class CoffeeDecorator implements Coffe {

    protected Coffe coffe;

    public CoffeeDecorator(Coffe coffe) {
        this.coffe = coffe;
    }

    @Override
    public double getPrice() {
        return coffe.getPrice();
    }

    @Override
    public String getDescription() {
        return coffe.getDescription();
    }

}
