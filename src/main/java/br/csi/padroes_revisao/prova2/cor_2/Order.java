package br.csi.padroes_revisao.prova2.cor_2;

import lombok.Data;

@Data
public class Order {

    private double totalPrice;
    private double discount;

    public Order(double discount, double totalPrice) {
        this.discount = discount;
        this.totalPrice = totalPrice;
    }
}
