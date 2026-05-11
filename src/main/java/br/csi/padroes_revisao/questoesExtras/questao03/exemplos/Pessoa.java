package br.csi.padroes_revisao.questoesExtras.questao03.exemplos;

import br.csi.padroes_revisao.questoesExtras.questao03.anotacoes.JsonDeep;
import br.csi.padroes_revisao.questoesExtras.questao03.anotacoes.JsonIgnore;
import br.csi.padroes_revisao.questoesExtras.questao03.exemplo.Endereco;

public class Pessoa {

    public String nome;

    @JsonIgnore
    private String senha;

    @JsonDeep
    private br.csi.padroes_revisao.questoesExtras.questao03.exemplo.Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}