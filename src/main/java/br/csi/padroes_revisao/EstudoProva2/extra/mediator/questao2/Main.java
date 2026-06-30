package br.csi.padroes_revisao.EstudoProva2.extra.mediator.questao2;

public class Main {
    public static void main(String[] args) {

        TorreMediator torre = new Torre();

        Aviao a1 = new Aviao("LATAM 123", torre);
        Aviao a2 = new Aviao("GOL 456", torre);
        Aviao a3 = new Aviao("AZUL 789", torre);

        a1.solicitarPouso();
        a2.solicitarPouso();
        a3.solicitarPouso();

    }
}
