package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2;

import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2.decorator.EmailDecorator;
import br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2.decorator.SMSDecorator;

public class Main {
    public static void main(String[] args) {

        Notification n1 = new BasicNotificatio();
        Notification n2 = new EmailDecorator(new BasicNotificatio());
        Notification n3 = new SMSDecorator(new EmailDecorator(new BasicNotificatio()));


        System.out.println("=== Notificação 1 ===");
        n1.send();

        System.out.println("\n=== Notificação 2 ===");
        n2.send();

        System.out.println("\n=== Notificação 3 ===");
        n3.send();
    }
}
