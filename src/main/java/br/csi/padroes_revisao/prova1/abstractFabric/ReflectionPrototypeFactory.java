package br.csi.padroes_revisao.prova1.abstractFabric;

public class ReflectionPrototypeFactory implements PrototypeAbstractFactory{
    @Override
    public Prototype criarPrototype(Object object) {

        return new ReflectionPrototype(object);

    }
}
