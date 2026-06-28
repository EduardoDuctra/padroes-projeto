package br.csi.padroes_revisao.prova2.cor_1.chain;

import br.csi.padroes_revisao.prova2.cor_1.Pedido;
import br.csi.padroes_revisao.prova2.cor_1.infra.AprovadorPedidos;

public class Quantidade extends AprovadorPedidos {

    public Quantidade(AprovadorPedidos proximoAprovador) {
        super(proximoAprovador);
    }

    @Override
    protected boolean validar(Pedido pedido) {

        if (pedido.getProdutos().size() > 10) {
            System.out.println("Compra recusada: número máximo de itens excedido.");
            return false;
        }
        return true;
    }
}
