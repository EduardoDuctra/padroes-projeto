package br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao01.exemplos;

import br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao01.anotacoes.NotNull;
import br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao01.anotacoes.ValidateObject;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Exemplo {

    private int id;

    @NotNull (msgErro = "nome obrigatório")
    private String nome;

    @NotNull(msgErro = "Descrição obrigatória")
    private String descricao;

    @ValidateObject (msgErro = "Objeto não pode ser null")
    private Exemplo2 endereco;
}
