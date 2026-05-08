package br.csi.padroes_revisao.abstractFactory;

import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Botao;
import br.csi.padroes_revisao.abstractFactory.componentesBasicos.CaixaTexto;
import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Menu;

public interface GUIFactory {

    Botao criarBotao();
    CaixaTexto criarCaixaTexto();
    Menu criarMenu();

}
