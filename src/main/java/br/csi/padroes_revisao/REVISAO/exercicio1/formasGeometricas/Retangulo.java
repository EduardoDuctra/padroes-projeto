package br.csi.padroes_revisao.REVISAO.exercicio1.formasGeometricas;

import br.csi.padroes_revisao.REVISAO.exercicio1.infra.FormaGeometrica;
import lombok.Data;

@Data
public class Retangulo implements FormaGeometrica {

    private double ladoA;
    private double ladoB;


    @Override
    public double calculaArea() {
        return ladoA*ladoB;
    }
}
