package br.csi.padroes_revisao.EstudoProva2.extra.observer.questao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Canal canal = new Canal();

        Inscrito inscrito1= new Inscrito("Joao");
        Inscrito inscrito2= new Inscrito("Maria");
        Inscrito inscrito3= new Inscrito("Pedro");


        List<Observer> inscritos = new ArrayList<Observer>();

        inscritos.add(inscrito1);
        inscritos.add(inscrito2);
        inscritos.add(inscrito3);

        canal.addInscritos(inscritos);

        canal.publicarVideo("Vídeo Teste");
    }
}
