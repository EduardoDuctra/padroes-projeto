package br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto;

import br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.infra.FormaGeometrica;
import br.csi.padroes_revisao.REVISAO.exercicio1_PadroesDeProjeto.infra.Volume;
import lombok.Data;

import java.util.Collection;

@Data
public class Imovel implements FormaGeometrica, Volume {

    private String identificacao;
    private String proprietario;
    private String endereco;
    private TipoUso tipo;
    private Collection<Comodo>comodos;



    @Override
    public double calculaArea() {

        double areaTotalImovel = 0;

        for (Comodo comodo : comodos) {
            areaTotalImovel += comodo.calculaArea();
        }
        return areaTotalImovel;
    }

    @Override
    public double calcularVolume() {
        double volumeTotal = 0;

        for (Comodo comodo : comodos) {
            volumeTotal += comodo.calcularVolume();
        }

        return volumeTotal;
    }
}
