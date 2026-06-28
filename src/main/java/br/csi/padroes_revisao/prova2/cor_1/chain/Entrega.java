package br.csi.padroes_revisao.prova2.cor_1.chain;

import br.csi.padroes_revisao.prova2.cor_1.Pedido;
import br.csi.padroes_revisao.prova2.cor_1.infra.AprovadorPedidos;

public class Entrega extends AprovadorPedidos {


    public Entrega(AprovadorPedidos proximoAprovador) {
        super(proximoAprovador);
    }


    @Override
    protected boolean validar(Pedido pedido) {

        if (!pedido.getEnderecoEntrega().startsWith("SP")) {
            System.out.println("Compra recusada: entrega indisponível para o endereço.");
            return false;
        } else {
            return true;
        }
    }
}
