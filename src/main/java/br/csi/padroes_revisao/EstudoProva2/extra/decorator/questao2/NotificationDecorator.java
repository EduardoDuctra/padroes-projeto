package br.csi.padroes_revisao.EstudoProva2.extra.decorator.questao2;

public class NotificationDecorator implements Notification{

   protected Notification notification;

   public NotificationDecorator(Notification notification) {
       this.notification = notification;
   }

    @Override
    public void send() {
        notification.send();
    }
}
