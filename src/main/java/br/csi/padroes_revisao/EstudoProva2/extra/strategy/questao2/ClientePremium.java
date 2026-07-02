package br.csi.padroes_revisao.EstudoProva2.extra.strategy.questao2;

public class ClientePremium implements Desconto{
    @Override
    public double calcular(double valor) {
        return valor*0.8;
    }
}
