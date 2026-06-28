package br.csi.padroes_revisao.prova2.cor_2.infra;

import br.csi.padroes_revisao.prova2.cor_2.Order;

public abstract class OrderHandler {

    protected OrderHandler successor;

    public OrderHandler(OrderHandler successor) {
        this.successor = successor;
    }

    public abstract void handleOrder(Order order);
}