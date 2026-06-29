package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2.decorator;

import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2.Notification;
import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2.NotificationDecorator;

public class EmailDecorator extends NotificationDecorator {

    public EmailDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Enviando por Email.");
    }
}
