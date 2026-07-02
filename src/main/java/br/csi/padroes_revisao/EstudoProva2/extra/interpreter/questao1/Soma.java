package br.csi.padroes_revisao.EstudoProva2.extra.interpreter.questao1;

public class Soma implements Expression {

   private Expression a;
   private Expression b;

    public Soma(Expression b, Expression a) {
        this.b = b;
        this.a = a;
    }

    @Override
    public int interpret() {
        return a.interpret() + b.interpret();
    }
}
