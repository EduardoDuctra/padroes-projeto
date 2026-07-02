package br.csi.padroes_revisao.EstudoProva2.extra.strategy.questao2;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(new SemDesconto());

        System.out.println(pedido.calcularTotal(100));

        pedido.setDesconto(new ClienteVIP());

        System.out.println(pedido.calcularTotal(100));

        pedido.setDesconto(new ClientePremium());

        System.out.println(pedido.calcularTotal(100));

    }

}