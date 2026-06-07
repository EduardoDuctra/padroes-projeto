package br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.fabricasConcretas;

import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.GUIFactory;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.classesConcretas.escura.BotaoEscuro;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.classesConcretas.escura.CaixaTextoEscura;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.classesConcretas.escura.MenuEscuro;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Botao;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.CaixaTexto;
import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.Menu;

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
