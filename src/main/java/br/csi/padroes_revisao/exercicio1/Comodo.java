package br.csi.padroes_revisao.exercicio1;

import br.csi.padroes_revisao.exercicio1.infra.FormaGeometrica;
import br.csi.padroes_revisao.exercicio1.infra.Volume;
import lombok.Data;

import java.util.Collection;
import java.util.List;

@Data
public class Comodo implements FormaGeometrica, Volume {

    private String identificacao;
    private double altura;
    private Collection<FormaGeometrica> formas;



    @Override
    public double calculaArea() {

        double areaTotal = 0;

        for(FormaGeometrica f : formas) {
            areaTotal += f.calculaArea();
        }

        return areaTotal;
    }

    @Override
    public double calcularVolume() {

        double volumeTotal = calculaArea()*altura;

        return volumeTotal;
    }
}
