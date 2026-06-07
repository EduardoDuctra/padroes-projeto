package br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.formasGeometricas;

import br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.infra.FormaGeometrica;
import lombok.Data;

@Data
public class Retangulo implements FormaGeometrica {

    //Immutable objetc
    private double ladoA;
    private double ladoB;


    @Override
    public double calculaArea() {
        return ladoA*ladoB;
    }
}
