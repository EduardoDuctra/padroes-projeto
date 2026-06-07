package br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao03;

import br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao03.exemplos.Endereco;
import br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao03.exemplos.Pessoa;

public class Main {

    public static void main(String[] args) throws Exception {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setNumero(100);

        Pessoa p = new Pessoa();

        p.nome = "Eduardo";
        p.setSenha("123");

        p.setEndereco(endereco);

        Builder builder = new Builder();

        Prototype framework = builder.build();

        framework.validarFrameword(p);

    }

}