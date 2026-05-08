package br.csi.padroes_revisao.abstractFactory.classesConcretas.clara;

import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Menu;

public class MenuClaro implements Menu {
    @Override
    public void render() {
        System.out.println("Menu Claro");
    }
}
