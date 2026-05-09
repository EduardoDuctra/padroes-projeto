package br.csi.padroes_revisao.prova2.abstractFactory;

public class DeepCopyFactory implements PrototypeAbstractFactory {

    @Override
    public Object criarPrototype() {
        return new Framework();
    }
}
