package br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.classesConcretas.clara;

import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Botao;

public class BotaoClaro implements Botao {
    @Override
    public void render() {
        System.out.println("Botão Claro");
    }
}
