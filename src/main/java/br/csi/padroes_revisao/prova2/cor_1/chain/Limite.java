package br.csi.padroes_revisao.prova2.cor_1.chain;

import br.csi.padroes_revisao.prova2.cor_1.Cliente;
import br.csi.padroes_revisao.prova2.cor_1.Pedido;
import br.csi.padroes_revisao.prova2.cor_1.infra.AprovadorPedidos;

public class Limite extends AprovadorPedidos {

    public Limite(AprovadorPedidos proximoAprovador) {
        super(proximoAprovador);
    }

    @Override
    protected boolean validar(Pedido pedido) {

        Cliente cliente = pedido.getCliente();

        if (pedido.getValorTotal()>cliente.getLimiteCredito()){
            System.out.println("Compra recusada: limite de crédito excedido.");
            return false;
        }
        return true;
    }
}
