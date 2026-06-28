package br.csi.padroes_revisao.prova2.cor_1.chain;

import br.csi.padroes_revisao.prova2.cor_1.Pedido;
import br.csi.padroes_revisao.prova2.cor_1.Produto;
import br.csi.padroes_revisao.prova2.cor_1.infra.AprovadorPedidos;

public class Estoque extends AprovadorPedidos {

    public Estoque(AprovadorPedidos proximoAprovador) {
        super(proximoAprovador);
    }

    @Override
    protected boolean validar(Pedido pedido) {
        for (Produto p:pedido.getProdutos()){
            if (!p.isEmEstoque()) {
                System.out.println("Compra recusada: produto fora de estoque - " + p.getNome());
                return false;
            }
        }
        return true;
    }
}
