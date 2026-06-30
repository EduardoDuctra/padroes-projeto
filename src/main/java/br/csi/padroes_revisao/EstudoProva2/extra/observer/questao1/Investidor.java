package br.csi.padroes_revisao.EstudoProva2.extra.observer.questao1;

public class Investidor implements Observer {

    private String nome;

    public Investidor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(double price) {
        System.out.println(nome + " recebeu atualização. Novo preço: R$ " + price);
    }
}
