package br.csi.padroes_revisao.prova2.command.infra;

import java.util.ArrayList;
import java.util.List;

public class Routine {

    private String nome;
    private List<Command> listaRotinas = new ArrayList<>();

    public Routine(String nome) {
        this.nome = nome;
    }

    public void addComando(Command comando) {
        listaRotinas.add(comando);
    }

    public void executarRotina(){
        System.out.println("Executando Rotina");

        for(Command comando : listaRotinas){
            comando.execute();
        }
    }
}
