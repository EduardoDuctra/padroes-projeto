package br.csi.padroes_revisao.EstudoProva2.extra.state.questao2;

import br.csi.padroes_revisao.EstudoProva2.extra.state.questao2.estados.NovoState;

public class Order {

    private State state;

    public Order() {
        this.state = new NovoState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);

    }

}
