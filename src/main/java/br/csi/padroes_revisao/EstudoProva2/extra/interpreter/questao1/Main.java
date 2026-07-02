package br.csi.padroes_revisao.EstudoProva2.extra.interpreter.questao1;

public class Main {
    public static void main(String[] args) {

        Expression soma = new Soma(
                new Numero(10),
                new Numero(20)
        );

        Expression subtracao = new Subtracao(
                new Numero(5),
                new Numero(2)
        );

        System.out.println(soma.interpret());
        System.out.println(subtracao.interpret());
    }
}
