package br.csi.padroes_revisao.abstractFactory.classesConcretas.clara;

import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Botao;

public class BotaoClaro implements Botao {
    @Override
    public void render() {
        System.out.println("Botão Claro");
    }
}
