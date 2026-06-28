package br.csi.padroes_revisao.prova2.cor_2;

import br.csi.padroes_revisao.prova2.cor_2.infra.OrderHandler;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Order o1 = new Order(0.0, 80);
        Order o2 = new Order(0.0,250);
        Order o3 = new Order(0.0,800);


        List<Order> pedidos = new ArrayList<>();
        pedidos.add(o1);
        pedidos.add(o2);
        pedidos.add(o3);

        OrderHandler chain =
                new StandardOrderHandler(
                        new VIPOrderHandler(
                                new SuperVIPOrderHandler(null)));



        for(Order pedido : pedidos){
            chain.handleOrder(pedido);

            System.out.println("-------------------------");
            System.out.println("Valor: R$ " + pedido.getTotalPrice());
            System.out.println("Desconto: R$ " + pedido.getDiscount());
            System.out.println("Valor Final: R$ " + (pedido.getTotalPrice() - pedido.getDiscount()));

        }
    }


}
