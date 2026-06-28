package br.csi.padroes_revisao.prova2.cor_1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private Long idPedido;
    private Cliente cliente;
    private String enderecoEntrega;
    private List<Produto> produtos;
    private double valorTotal;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(idPedido, pedido.idPedido);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPedido);
    }
}
