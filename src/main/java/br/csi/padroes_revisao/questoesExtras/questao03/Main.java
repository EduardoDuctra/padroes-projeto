package br.csi.padroes_revisao.questoesExtras.questao03;

import br.csi.padroes_revisao.questoesExtras.questao03.exemplos.Pessoa;

public class Main {

    public static void main(String[] args) throws Exception {

        br.csi.padroes_revisao.questoesExtras.questao03.exemplo.Endereco endereco = new br.csi.padroes_revisao.questoesExtras.questao03.exemplo.Endereco();
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