package br.csi.padroes_revisao.EstudoProva2.extra.interpreter.questao1;

public class Numero implements Expression {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int interpret() {
        return numero;
    }
}
