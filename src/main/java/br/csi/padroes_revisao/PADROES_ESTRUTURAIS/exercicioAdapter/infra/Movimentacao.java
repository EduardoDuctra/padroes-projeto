package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movimentacao {

    private String descricao;
    private Double valor;
    private TipoMovimentacao tipoMovimentacao;

}
