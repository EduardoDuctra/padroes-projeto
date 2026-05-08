package br.csi.padroes_revisao.copiaProfunda;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Produto implements ProdutoPrototype{

    private String nome;
    private String categoria;
    private double preco;
    Map<String, String> atributos;

    public Produto(String nome, String categoria, double preco) {

        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        atributos = new HashMap<String, String>();

    }

    public void adicionarAtributo(String nome, String valor) {
        atributos.put(nome, valor);
    }

    //copia profunda -> clono o objeto
    //reutiliza objetos existentes
    @Override
    public Object clone() {

        Produto copiaProfunda = new Produto(nome, categoria, preco);

        //tudo bem copiar o origina -> string é imutavel -> java copia igual
        copiaProfunda.atributos = new HashMap<>(atributos);

        return copiaProfunda;
    }
}
