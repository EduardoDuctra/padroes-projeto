package br.csi.padroes_revisao.EstudoProva2.extra.state.questao1;

public class YellowState implements State {


    @Override
    public void next(TrafficLight trafficLight) {

        System.out.println("Amarelo -> Vermelho");
        trafficLight.setState(new RedState());
    }
}
