package br.csi.padroes_revisao.abstractFactory.classesConcretas.escura;

import br.csi.padroes_revisao.abstractFactory.componentesBasicos.CaixaTexto;

public class CaixaTextoEscura implements CaixaTexto {
    @Override
    public void render() {
        System.out.println("Caixa de Texto Escura");
    }
}
