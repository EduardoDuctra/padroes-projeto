package br.csi.padroes_revisao.exercicioComposite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Produto implements Item{

    private String descricao;
    private double preco;


    @Override
    public double getPreco() {
        return preco;
    }
}
