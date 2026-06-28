package br.csi.padroes_revisao.prova2.cor_2;

import br.csi.padroes_revisao.prova2.cor_2.infra.OrderHandler;

public class StandardOrderHandler extends OrderHandler {


    public StandardOrderHandler(OrderHandler successor) {
        super(successor);
    }

    @Override
    public void handleOrder(Order order) {

        if(order.getTotalPrice()<100){

            order.setDiscount(order.getTotalPrice() * 0.05);
            System.out.println("Desconto de 5% aplicado.");
        } else if(successor!= null) {
            successor.handleOrder(order);
        }

    }
}
