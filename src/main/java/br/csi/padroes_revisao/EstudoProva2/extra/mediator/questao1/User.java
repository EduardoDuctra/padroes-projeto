package br.csi.padroes_revisao.EstudoProva2.extra.mediator.questao1;

public class User {

    private String nome;
    private ChatMediator mediator;

    public User(String nome, ChatMediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
    }

    public void send(String message){
        System.out.println(nome + " enviou: " + message);
        mediator.sendMensagem(message, this);
    }

    public void receive(String message){
        System.out.println(nome + " recebeu: " + message);
    }
}
