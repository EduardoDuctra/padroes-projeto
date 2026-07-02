package br.csi.padroes_revisao.EstudoProva2.extra.strategy.questao1;

public class Pedido {

    private Frete frete;

    public Pedido(Frete frete) {
        this.frete = frete;
    }

    public double calculaFrete(double valorPedido) {
        return frete.calcular(valorPedido);
    }
}
