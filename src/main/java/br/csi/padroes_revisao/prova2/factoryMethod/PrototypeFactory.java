package br.csi.padroes_revisao.prova2.factoryMethod;

import java.lang.reflect.InvocationTargetException;

public interface PrototypeFactory {

    Object copyFromPrototype (Object prototype) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException;
}
