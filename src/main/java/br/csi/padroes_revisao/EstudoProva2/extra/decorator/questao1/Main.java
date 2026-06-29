package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1;

import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1.decorator.ChocolateDecorator;
import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1.decorator.MilkDecorator;

public class Main {
    public static void main(String[] args) {

        Coffe cafe1 = new SimpleCoffee();
        Coffe cafe2 = new MilkDecorator(new SimpleCoffee());
        Coffe cafe3 = new ChocolateDecorator(new MilkDecorator(new SimpleCoffee()));

        System.out.println(cafe1.getDescription() +
                " - R$ " + cafe1.getPrice());

        System.out.println(cafe2.getDescription() +
                " - R$ " + cafe2.getPrice());

        System.out.println(cafe3.getDescription() +
                " - R$ " + cafe3.getPrice());

    }
}
