package br.csi.padroes_revisao.EstudoProva2.extra.mediator.questao1;

public class Main {
    public static void main(String[] args) {

        ChatMediator chat = new Chat();

        User joao = new User("João", chat);
        User maria = new User("Maria", chat);
        User pedro = new User("Pedro", chat);

        chat.addUser(joao);
        chat.addUser(maria);
        chat.addUser(pedro);

        joao.send("Olá pessoal!");
    }
}
