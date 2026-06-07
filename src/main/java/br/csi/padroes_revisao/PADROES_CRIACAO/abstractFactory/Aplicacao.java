package br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory;

import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Botao;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.CaixaTexto;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Menu;

public class Aplicacao {

    private GUIFactory guiFactory;

    private Botao botao;
    private CaixaTexto caixaTexto;
    private Menu menu;

    //vai receber um fabrica e decidir como criar
    //os componentes vão ser criados de acordo com a fabrica
    public Aplicacao(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;

        //crio os botões com base na fabrica que eu mandar
        botao = guiFactory.criarBotao();
        caixaTexto = guiFactory.criarCaixaTexto();
        menu = guiFactory.criarMenu();
    }

    public void executa(){
        botao.render();
        caixaTexto.render();
        menu.render();
    }
}
