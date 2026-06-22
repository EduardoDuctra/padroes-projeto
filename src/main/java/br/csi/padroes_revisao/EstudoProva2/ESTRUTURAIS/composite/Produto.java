package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.composite;

import java.util.Collection;
import java.util.List;

public class Produto implements Empacotavel{

    private Double preco;

    public Produto(Double preco) {
        this.preco = preco;
    }

    @Override
    public Collection<Empacotavel> getPacotesContidos() {
        return List.of();
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }
}
