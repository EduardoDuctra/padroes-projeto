package br.csi.padroes_revisao.abstractFactory;

import br.csi.padroes_revisao.abstractFactory.fabricasConcretas.TemaClaroFactory;

public class Main {
    public static void main(String[] args) {

        TemaClaroFactory temaClaroFactory = new TemaClaroFactory();
        Aplicacao app = new Aplicacao(temaClaroFactory);

        app.executa();
    }
}
