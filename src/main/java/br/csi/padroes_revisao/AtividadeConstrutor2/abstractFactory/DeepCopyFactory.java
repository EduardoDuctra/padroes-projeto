package br.csi.padroes_revisao.AtividadeConstrutor2.abstractFactory;

public class DeepCopyFactory implements PrototypeAbstractFactory {

    @Override
    public Object criarPrototype() {
        return new Framework();
    }
}
