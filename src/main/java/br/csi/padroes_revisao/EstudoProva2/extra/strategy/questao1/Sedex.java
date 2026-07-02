package br.csi.padroes_revisao.EstudoProva2.extra.strategy.questao1;

public class Sedex implements Frete{

    @Override
    public double calcular(double valorPedido) {
        return 20;
    }
}
