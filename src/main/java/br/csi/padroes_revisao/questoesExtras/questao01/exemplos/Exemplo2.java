package br.csi.padroes_revisao.questoesExtras.questao01.exemplos;


import br.csi.padroes_revisao.questoesExtras.questao01.anotacoes.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Exemplo2 {

    @NotNull(msgErro = "Rua obrigatória")
    private String rua;

}
