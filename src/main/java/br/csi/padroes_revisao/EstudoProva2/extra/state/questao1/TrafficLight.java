package br.csi.padroes_revisao.EstudoProva2.extra.state.questao1;

public class TrafficLight {

    private State state;


    public TrafficLight() {
        this.state = new GreenState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState(){
        state.next(this);
    }
}
