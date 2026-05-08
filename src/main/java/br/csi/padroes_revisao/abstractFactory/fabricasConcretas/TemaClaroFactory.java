package br.csi.padroes_revisao.abstractFactory.fabricasConcretas;

import br.csi.padroes_revisao.abstractFactory.GUIFactory;
import br.csi.padroes_revisao.abstractFactory.classesConcretas.clara.BotaoClaro;
import br.csi.padroes_revisao.abstractFactory.classesConcretas.clara.CaixaTextoClara;
import br.csi.padroes_revisao.abstractFactory.classesConcretas.clara.MenuClaro;
import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Botao;
import br.csi.padroes_revisao.abstractFactory.componentesBasicos.CaixaTexto;
import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Menu;

public class TemaClaroFactory implements GUIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoClara();
    }

    @Override
    public Menu criarMenu() {
        return new MenuClaro();
    }
}
