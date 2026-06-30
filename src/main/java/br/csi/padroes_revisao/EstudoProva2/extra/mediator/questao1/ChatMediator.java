package br.csi.padroes_revisao.EstudoProva2.extra.mediator.questao1;

public interface ChatMediator {

    void sendMensagem(String mensagem, User sender);
    void addUser(User user);
}
