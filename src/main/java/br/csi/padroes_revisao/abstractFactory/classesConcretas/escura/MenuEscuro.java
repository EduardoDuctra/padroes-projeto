package br.csi.padroes_revisao.abstractFactory.classesConcretas.escura;

import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Menu;

public class MenuEscuro implements Menu {
    @Override
    public void render() {
        System.out.println("Menu Escuro");
    }
}
