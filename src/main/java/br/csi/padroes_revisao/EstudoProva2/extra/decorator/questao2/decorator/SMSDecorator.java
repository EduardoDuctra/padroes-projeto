package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2.decorator;

import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2.Notification;
import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2.NotificationDecorator;

public class SMSDecorator extends NotificationDecorator {

    public SMSDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Enviando por SMS.");
    }
}
