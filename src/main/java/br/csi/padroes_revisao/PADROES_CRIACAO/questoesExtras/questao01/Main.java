package br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao01;

import br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao01.exemplos.Exemplo;
import br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao01.exemplos.Exemplo2;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Exemplo ex = new Exemplo();
        ex.setId(1);
        ex.setNome("Eduardo");
        ex.setDescricao("Aluno");

        Exemplo2 ex2 = new Exemplo2();
        ex2.setRua("Rua 1");

        ex.setEndereco(ex2);

        ValidationFramework framework = new ValidationFramework(ex);
        framework.validade(ex);

    }
}
