package br.csi.padroes_revisao.REVISAO.exercicio1.formasGeometricas;

import br.csi.padroes_revisao.REVISAO.exercicio1.infra.FormaGeometrica;
import lombok.Data;

@Data
public class SemiCirculo implements FormaGeometrica {

    private double raio;
    private double grau;


    @Override
    public double calculaArea() {

        double area = Math.PI * Math.pow(raio, 2) * (grau/360);
        return area;
    }
}
