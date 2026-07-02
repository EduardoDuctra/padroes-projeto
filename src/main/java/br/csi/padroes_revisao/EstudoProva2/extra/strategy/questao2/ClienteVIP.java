package br.csi.padroes_revisao.EstudoProva2.extra.strategy.questao2;

public class ClienteVIP implements Desconto{
    @Override
    public double calcular(double valor) {
        return valor*0.9;
    }
}
