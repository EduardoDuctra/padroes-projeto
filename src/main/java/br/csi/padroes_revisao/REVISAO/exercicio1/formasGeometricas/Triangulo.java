package br.csi.padroes_revisao.REVISAO.exercicio1.formasGeometricas;

import br.csi.padroes_revisao.REVISAO.exercicio1.infra.FormaGeometrica;
import lombok.Data;

@Data
public class Triangulo implements FormaGeometrica {

    private double altura;
    private double base;

    @Override
    public double calculaArea() {
        return (base*altura)/2;
    }
}
