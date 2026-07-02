package br.csi.padroes_revisao.EstudoProva2.extra.strategy.questao2;

public class Pedido {

    private Desconto desconto;

    public Pedido(Desconto desconto) {
        this.desconto = desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularTotal(double valor){
        return desconto.calcular(valor);
    }
}
