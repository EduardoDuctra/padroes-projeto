package br.csi.padroes_revisao.EstudoProva2.extra.state.questao1;

public class RedState implements State {


    @Override
    public void next(TrafficLight trafficLight) {

        System.out.println("Vermelho -> Verde");
        trafficLight.setState(new GreenState());

    }
}
