package br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.classesConcretas.clara;

import br.csi.padroes_revisao.PADROES_CRIACAO.abstractFactory.componentesBasicos.CaixaTexto;

public class CaixaTextoClara implements CaixaTexto {
    @Override
    public void render() {
        System.out.println("Caixa de Texto Clara");
    }
}
