package br.csi.padroes_revisao.EstudoProva2.extra.observer.questao2;

public class Inscrito implements Observer {

    private String nome;

    public Inscrito(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String video) {
        System.out.println(nome + " recebeu notificação do vídeo: " + video);
    }
}
