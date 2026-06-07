package br.csi.padroes_revisao.REVISAO.exercicio2.infra;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movimentacao {

    private String descricao;
    private Double valor;
    private TipoMovimentacao tipoMovimentacao;

}
