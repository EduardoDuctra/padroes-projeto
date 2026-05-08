package br.csi.padroes_revisao.abstractFactory.fabricasConcretas;

import br.csi.padroes_revisao.abstractFactory.GUIFactory;
import br.csi.padroes_revisao.abstractFactory.classesConcretas.escura.BotaoEscuro;
import br.csi.padroes_revisao.abstractFactory.classesConcretas.escura.CaixaTextoEscura;
import br.csi.padroes_revisao.abstractFactory.classesConcretas.escura.MenuEscuro;
import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Botao;
import br.csi.padroes_revisao.abstractFactory.componentesBasicos.CaixaTexto;
import br.csi.padroes_revisao.abstractFactory.componentesBasicos.Menu;

public class TemaEscuroFactory implements GUIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoEscura();
    }

    @Override
    public Menu criarMenu() {
        return new MenuEscuro();
    }
}
