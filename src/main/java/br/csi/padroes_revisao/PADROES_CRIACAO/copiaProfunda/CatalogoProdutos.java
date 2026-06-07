package br.csi.padroes_revisao.PADROES_CRIACAO.copiaProfunda;

import java.util.HashMap;
import java.util.Map;

public class CatalogoProdutos {

    Map<String, Produto> prototipoProdutos = new HashMap<>();


    //adiciono na lista
    public void addProduto(String nome, Produto produto) {
        prototipoProdutos.put(nome, produto);
    }

    public Object clonarProduto (String nome){

        Produto produto = prototipoProdutos.get(nome);

        if(produto == null){

            System.out.println("Nenhum produto");
            return null;
        }

        return produto.clone();

    }
}
