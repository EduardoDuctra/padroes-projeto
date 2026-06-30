package br.csi.padroes_revisao.EstudoProva2.extra.mediator.questao2;

public class Torre implements TorreMediator{
    @Override
    public void solicitarPouso(Aviao aviao) {
        System.out.println("Torre autorizou o pouso do avião " + aviao.getNome());
    }
}
