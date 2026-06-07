package br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.classesConcretas.clara;

import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Menu;

public class MenuClaro implements Menu {
    @Override
    public void render() {
        System.out.println("Menu Claro");
    }
}
