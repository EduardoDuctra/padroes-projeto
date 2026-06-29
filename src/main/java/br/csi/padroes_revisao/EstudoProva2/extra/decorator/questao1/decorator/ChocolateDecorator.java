package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1.decorator;

import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1.Coffe;

public class ChocolateDecorator extends CoffeeDecorator {

    public ChocolateDecorator(Coffe coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Chocolate";
    }
}