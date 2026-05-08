package br.csi.padroes_revisao.abstractFactory.classesConcretas.clara;

import br.csi.padroes_revisao.abstractFactory.componentesBasicos.CaixaTexto;

public class CaixaTextoClara implements CaixaTexto {
    @Override
    public void render() {
        System.out.println("Caixa de Texto Clara");
    }
}
