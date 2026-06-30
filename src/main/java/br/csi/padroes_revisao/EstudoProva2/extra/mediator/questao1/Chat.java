package br.csi.padroes_revisao.EstudoProva2.extra.mediator.questao1;

import java.util.ArrayList;
import java.util.List;

public class Chat implements ChatMediator{


    private List<User>users = new ArrayList<User>();



    @Override
    public void sendMensagem(String mensagem, User sender) {
        for(User u : users){
            if( u != sender){
                u.receive(mensagem);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
