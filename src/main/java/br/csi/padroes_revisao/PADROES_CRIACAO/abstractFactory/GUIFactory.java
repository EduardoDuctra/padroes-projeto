package br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory;

import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Botao;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.CaixaTexto;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Menu;

public interface GUIFactory {

    Botao criarBotao();
    CaixaTexto criarCaixaTexto();
    Menu criarMenu();

}
