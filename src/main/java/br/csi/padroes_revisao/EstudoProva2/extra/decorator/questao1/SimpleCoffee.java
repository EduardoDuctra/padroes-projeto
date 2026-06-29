package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao1;

public class SimpleCoffee implements Coffe{

    double preco = 8.0;

    @Override
    public double getPrice() {
        return preco;
    }

    @Override
    public String getDescription() {
        return "Café";
    }
}
