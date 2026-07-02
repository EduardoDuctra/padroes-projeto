package br.csi.padroes_revisao.EstudoProva2.extra.state.questao2.estados;

import br.csi.padroes_revisao.EstudoProva2.extra.state.questao2.Order;
import br.csi.padroes_revisao.EstudoProva2.extra.state.questao2.State;

public class PagoState implements State {

    @Override
    public void next(Order order) {

        System.out.println("Pedido enviado.");

        order.setState(new EnviadoState());
    }
}
