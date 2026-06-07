package br.csi.padroes_revisao.REVISAO.exercicio1;

import br.csi.padroes_revisao.REVISAO.exercicio1.formasGeometricas.Retangulo;
import br.csi.padroes_revisao.REVISAO.exercicio1.formasGeometricas.Triangulo;
import br.csi.padroes_revisao.REVISAO.exercicio1.infra.FormaGeometrica;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Retangulo r1 = new Retangulo();

        r1.setLadoA(2);
        r1.setLadoB(3);

        Triangulo t1 = new Triangulo();
        t1.setAltura(3);
        t1.setBase(3);

        Comodo comodo = new Comodo();
        comodo.setIdentificacao("Sala");
        comodo.setAltura(3);

        Collection<FormaGeometrica> formas = new ArrayList<>();
        formas.add(r1);
        formas.add(t1);

        comodo.setFormas(formas);

        System.out.println("Área da Sala: " + comodo.calculaArea());
        System.out.println("Volume da Sala: " + comodo.calcularVolume());


        Retangulo r2 = new Retangulo();
        r2.setLadoA(5);
        r2.setLadoB(6);

        Comodo comodo2 = new Comodo();
        comodo2.setIdentificacao("Quarto");
        comodo2.setAltura(3);

        Collection<FormaGeometrica> formas2 = new ArrayList<>();
        formas2.add(r2);

        comodo2.setFormas(formas2);


        System.out.println("Área do Quarto: " + comodo2.calculaArea());
        System.out.println("Volume do Quarto: " + comodo2.calcularVolume());

        Imovel imovel = new Imovel();
        imovel.setIdentificacao("Imovel 1");
        imovel.setTipo(TipoUso.RESIDENCIAL);
        imovel.setProprietario("Eu");
        imovel.setEndereco("Rua dos bobos");

        Collection<Comodo> comodos = new ArrayList<>();
        comodos.add(comodo);
        comodos.add(comodo2);
        imovel.setComodos(comodos);


        System.out.println("Área total do imóvel: " + imovel.calculaArea());







    }

}
