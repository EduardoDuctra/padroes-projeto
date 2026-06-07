package br.csi.padroes_revisao.PADROES_CRIACAO.builder.construtor;

import br.csi.padroes_revisao.PADROES_CRIACAO.builder.classesConcretas.Calzone;
import br.csi.padroes_revisao.PADROES_CRIACAO.builder.interfaces.Builder;
import br.csi.padroes_revisao.PADROES_CRIACAO.builder.interfaces.Lanche;

public class CalzoneBuilder implements Builder {

    Calzone calzone;

    //inicializar
    @Override
    public void prepararMassa() {
        this.calzone = new Calzone();
        System.out.println("Preparando Massa - CALZONE ");
    }

    @Override
    public void colocarMolhoTomate() {
        System.out.println("Colocando molho");
    }

    @Override
    public void colocarQueijo() {
        System.out.println("Colocando queijo");
    }

    @Override
    public void colocarCalabresa() {
        System.out.println("Colocando calabresa");
    }

    @Override
    public void colocarMilho() {
        System.out.println("Colocando milho");

    }

    @Override
    public void assar() {

        if(calzone ==null){
            throw new IllegalArgumentException("Pizza vazia");
        }
        System.out.println("Assarando");

    }

    @Override
    public Lanche build() {

        if(calzone ==null){
            throw new IllegalArgumentException("Pizza vazia");
        }

        return calzone;
    }
}
