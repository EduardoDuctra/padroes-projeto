package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioComposite;

public class Main {
    public static void main(String[] args) {

        Produto laranja = new Produto("Laranja", 3);
        Produto maca = new Produto("Maça", 3);
        Produto uva = new Produto("Uva", 3);
        Caixa caixaPequena = new Caixa();

        Caixa caixa = new Caixa();

        caixa.adicionarProduto(laranja);
        caixa.adicionarProduto(maca);
        caixa.adicionarProduto(uva);
        caixa.adicionarProduto(caixaPequena);



        System.out.println("Valor total da caixa é de R$" + caixa.getPreco());


    }
}
