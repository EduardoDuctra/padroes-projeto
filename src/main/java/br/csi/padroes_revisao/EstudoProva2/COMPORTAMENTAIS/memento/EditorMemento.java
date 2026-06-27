package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.memento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditorMemento {

    private String texto;
    private int posicaoCursor;
    private int inicioSelecao;
    private int fimSelecao;

}
