package br.csi.padroes_revisao.abstractFactory.classesConcretas.escura;

import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Botao;

public class BotaoEscuro implements Botao {
    @Override
    public void render() {
        System.out.println("Botão Escuro");
    }
}
