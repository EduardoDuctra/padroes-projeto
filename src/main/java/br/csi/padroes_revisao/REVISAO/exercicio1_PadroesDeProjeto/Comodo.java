package br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto;

import br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.infra.FormaGeometrica;
import br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.infra.Volume;
import lombok.Data;

import java.util.Collection;

import static br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.infra.Constantes.ALTURA_PADRAO;

@Data
public class Comodo implements FormaGeometrica, Volume {

    private String identificacao;
    private double altura = ALTURA_PADRAO;
    private Collection<FormaGeometrica> formas;



    @Override
    public double calculaArea() {
        return somarAreas();
    }

    @Override
    public double calcularVolume() {

        return retornarVolume();
    }

    //metodo privado
    private double somarAreas(){

        double areaTotal = 0;

        for(FormaGeometrica f : formas) {
            areaTotal += f.calculaArea();
        }

        return areaTotal;
    }

    //metodo privado
    private double retornarVolume(){

        double volumeTotal = calculaArea()*altura;

        return volumeTotal;
    }




}
