package br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.classesConcretas.escura;

import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Botao;

public class BotaoEscuro implements Botao {
    @Override
    public void render() {
        System.out.println("Botão Escuro");
    }
}
