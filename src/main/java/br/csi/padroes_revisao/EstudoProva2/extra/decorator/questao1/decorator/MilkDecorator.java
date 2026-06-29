package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1.decorator;

import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1.Coffe;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffe coffe) {
        super(coffe);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Leite";
    }

}
