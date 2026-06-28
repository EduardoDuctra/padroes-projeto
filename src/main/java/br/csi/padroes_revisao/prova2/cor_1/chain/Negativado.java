package br.csi.padroes_revisao.prova2.cor_1.chain;

import br.csi.padroes_revisao.prova2.cor_1.Cliente;
import br.csi.padroes_revisao.prova2.cor_1.Pedido;
import br.csi.padroes_revisao.prova2.cor_1.infra.AprovadorPedidos;

public class Negativado extends AprovadorPedidos {

    public Negativado(AprovadorPedidos proximoAprovador) {
        super(proximoAprovador);
    }

    @Override
    protected boolean validar(Pedido pedido) {

        Cliente cliente = pedido.getCliente();

        if (cliente.isNegativado()){
            System.out.println("Compra recusada: cliente negativado.");
            return false;
        }

        return true;
    }
}
