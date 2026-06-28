package br.csi.padroes_revisao.prova2.cor_1;

import br.csi.padroes_revisao.prova2.cor_1.chain.*;
import br.csi.padroes_revisao.prova2.cor_1.infra.AprovadorPedidos;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente=new Cliente("222", 3000.0, false);

        Produto p1 = new Produto("1","Mouse", true);
        Produto p2 = new Produto("2","Teclado", true);
        Produto p3 = new Produto("3","Notebook", false); // fora de estoque

        Pedido pedido=new Pedido(1L, cliente, "SP - Av. Paulista",Arrays.asList(p1, p2, p3),2800.0);



        AprovadorPedidos aprovador =
                new Limite(
                        new Negativado(
                                new Estoque(
                                        new Entrega(
                                                new Quantidade(null)))));


        boolean aprovado = aprovador.autoriza(pedido);
    }
}