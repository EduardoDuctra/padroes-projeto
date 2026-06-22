package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.composite;

public class Main {
    public static void main(String[] args) {

        Caixa principal = new Caixa(1.00);
        Caixa caixa2 = new Caixa(1.00);
        Caixa caixa3 = new Caixa(1.00);
        Caixa caixa4 = new Caixa(1.00);

        Produto p1 = new Produto(10.00);
        Produto p2 = new Produto(20.00);
        Produto p3 = new Produto(30.00);
        Produto p4 = new Produto(40.00);
        Produto p5 = new Produto(50.00);

        principal.getPacotesContidos().add(caixa2);
        principal.getPacotesContidos().add(caixa3);
        principal.getPacotesContidos().add(p1);
        caixa2.getPacotesContidos().add(p2);
        caixa2.getPacotesContidos().add(p3);
        caixa3.getPacotesContidos().add(p4);
        caixa3.getPacotesContidos().add(p5);
        caixa3.getPacotesContidos().add(caixa4);


        System.out.println("Preco total: " + principal.getPreco());





    }
}
