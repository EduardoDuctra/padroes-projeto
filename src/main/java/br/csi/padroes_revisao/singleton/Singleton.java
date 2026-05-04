package br.csi.padroes_revisao.singleton;

public class Singleton {

    private static Singleton instancia;

    public Singleton() {
    }

    public static Singleton getInstancia() {

        if(instancia == null){
            instancia = new Singleton();
        }

        return instancia;
    }
}
