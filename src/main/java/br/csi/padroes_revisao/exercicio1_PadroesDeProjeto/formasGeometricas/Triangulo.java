package br.csi.padroes_revisao.exercicio1_PadroesDeProjeto.formasGeometricas;

import br.csi.padroes_revisao.exercicio1_PadroesDeProjeto.infra.FormaGeometrica;
import lombok.Data;

@Data
public class Triangulo implements FormaGeometrica {

    //Immutable objetc
    private double altura;
    private double base;

    @Override
    public double calculaArea() {
        return (base*altura)/2;
    }
}
