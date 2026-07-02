package br.csi.padroes_revisao.EstudoProva2.extra.state.questao1;

public class GreenState implements State {


    @Override
    public void next(TrafficLight trafficLight) {

        System.out.println("Verde -> Amarelo");
        trafficLight.setState(new YellowState());
    }
}
