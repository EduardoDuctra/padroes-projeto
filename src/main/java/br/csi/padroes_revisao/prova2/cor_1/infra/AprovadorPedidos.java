package br.csi.padroes_revisao.prova2.cor_1.infra;


import br.csi.padroes_revisao.prova2.cor_1.Pedido;

public abstract class AprovadorPedidos {

    private AprovadorPedidos proximoAprovador;

    public AprovadorPedidos(AprovadorPedidos proximoAprovador) {
        this.proximoAprovador = proximoAprovador;
    }

    protected abstract boolean validar(Pedido pedido);

    public boolean autoriza(Pedido pedido) {
        if (!validar(pedido)) {
            return false;
        }

        if (proximoAprovador != null) {
            return proximoAprovador.autoriza(pedido);
        }

        System.out.println("Compra aprovada!");
        return true;
    }

}
