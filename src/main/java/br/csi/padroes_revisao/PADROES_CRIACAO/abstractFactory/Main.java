package br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory;

import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.fabricasConcretas.TemaClaroFactory;

public class Main {
    public static void main(String[] args) {

        TemaClaroFactory temaClaroFactory = new TemaClaroFactory();
        Aplicacao app = new Aplicacao(temaClaroFactory);

        app.executa();
    }
}
