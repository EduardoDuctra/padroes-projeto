package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR;

import lombok.Data;

@Data
public class Reembolso {

    private Double valorPedido;
    private String descricao;

    public Reembolso(Double valorPedido, String descricao) {
        this.valorPedido = valorPedido;
        this.descricao = descricao;
    }
}
