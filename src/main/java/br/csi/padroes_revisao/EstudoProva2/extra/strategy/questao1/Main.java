package br.csi.padroes_revisao.EstudoProva2.extra.strategy.questao1;

public class Main {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(new Sedex());

        Pedido pedido2 = new Pedido(new Pac());

        Pedido pedido3 = new Pedido(new Retirada());

        System.out.println("Sedex: R$ "
                + pedido1.calculaFrete(100));

        System.out.println("PAC: R$ "
                + pedido2.calculaFrete(100));

        System.out.println("Retirada: R$ "
                + pedido3.calculaFrete(100));

    }

}