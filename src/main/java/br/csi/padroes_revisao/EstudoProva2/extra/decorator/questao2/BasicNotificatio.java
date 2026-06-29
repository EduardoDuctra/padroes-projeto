package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2;

public class BasicNotificatio implements Notification{


    @Override
    public void send() {
        System.out.println("Notificação criada");
    }
}
