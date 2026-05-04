package br.csi.padroes_revisao.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();

        //tem que dar true pq são o mesmo objeto
        System.out.println(s1 == s2);

    }
}
