package br.csi.padroes_revisao.prova2.cor_2;

import br.csi.padroes_revisao.prova2.cor_2.infra.OrderHandler;

public class VIPOrderHandler extends OrderHandler {
    public VIPOrderHandler(OrderHandler successor) {
        super(successor);
    }

    @Override
    public void handleOrder(Order order) {
        if (order.getTotalPrice() >= 100 && order.getTotalPrice() <= 500) {

            order.setDiscount(order.getTotalPrice() * 0.10);
            System.out.println("Desconto de 10% aplicado.");
        } else if (successor != null) {
            successor.handleOrder(order);
        }
    }
}
