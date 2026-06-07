package br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.formasGeometricas;

import br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.infra.FormaGeometrica;
import lombok.Data;

@Data
public class SemiCirculo implements FormaGeometrica {

    //Immutable objetc
    private double raio;
    private double grau;


    @Override
    public double calculaArea() {

        double area = Math.PI * Math.pow(raio, 2) * (grau/360);
        return area;
    }
}
