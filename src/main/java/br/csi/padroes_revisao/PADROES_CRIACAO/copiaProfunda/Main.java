package br.csi.padroes_revisao.PADROES_CRIACAO.copiaProfunda;

public class Main {
    public static void main(String[] args) {

        CatalogoProdutos catalogoProdutos = new CatalogoProdutos();

        Produto noteBookeGamer = new Produto("NoteGamer", "Informatica", 4500);
        noteBookeGamer.adicionarAtributo("Processador", "I5");
        noteBookeGamer.adicionarAtributo("Memoria RAM", "32GB");

        catalogoProdutos.addProduto("NoteGamer", noteBookeGamer);


        Produto meuProduto = (Produto) catalogoProdutos.clonarProduto("NoteGamer");
        meuProduto.setPreco(5500);
        noteBookeGamer.adicionarAtributo("Memoria RAM", "64GB");


        System.out.println(noteBookeGamer);
        System.out.println(meuProduto);


        System.out.println(System.identityHashCode(noteBookeGamer));
        System.out.println(System.identityHashCode(meuProduto));

    }
}
