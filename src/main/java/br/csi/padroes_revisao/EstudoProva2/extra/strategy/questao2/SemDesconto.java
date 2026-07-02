package br.csi.padroes_revisao.EstudoProva2.extra.strategy.questao2;

public class SemDesconto implements Desconto{
    @Override
    public double calcular(double valor) {
        return valor;
    }
}
