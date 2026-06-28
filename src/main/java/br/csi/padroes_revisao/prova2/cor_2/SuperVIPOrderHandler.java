package br.csi.padroes_revisao.prova2.cor_2;

import br.csi.padroes_revisao.prova2.cor_2.infra.OrderHandler;

public class SuperVIPOrderHandler extends OrderHandler {
    public SuperVIPOrderHandler(OrderHandler successor) {
        super(successor);
    }

    @Override
    public void handleOrder(Order order) {
        if(order.getTotalPrice()>500){

            order.setDiscount(order.getTotalPrice() * 0.15);
            System.out.println("Desconto de 15% aplicado.");
        } else if(successor!= null) {
            successor.handleOrder(order);
        }
    }
}
