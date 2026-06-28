package br.csi.padroes_revisao.prova2.cor_1;

public class aprovadorPedidos {

    public boolean aprovar(Pedido pedido){
        Cliente cliente = pedido.getCliente();

        // Verifica crédito
        if (pedido.getValorTotal()>cliente.getLimiteCredito()){
            System.out.println("Compra recusada: limite de crédito excedido.");
            return false;
        }

        // Verifica negativado
        if (cliente.isNegativado()){
            System.out.println("Compra recusada: cliente negativado.");
            return false;
        }

        // Verifica estoque
        for (Produto p:pedido.getProdutos()){
            if (!p.isEmEstoque()) {
                System.out.println("Compra recusada: produto fora de estoque - " + p.getNome());
                return false;
            }
        }

        // Verifica área de entrega
        if (!pedido.getEnderecoEntrega().startsWith("SP")) {
            System.out.println("Compra recusada: entrega indisponível para o endereço.");
            return false;
        }

        // Verifica quantidade de itens
        if (pedido.getProdutos().size() > 10) {
            System.out.println("Compra recusada: número máximo de itens excedido.");
            return false;
        }

        System.out.println("Compra aprovada!");
        return true;
    }

}
