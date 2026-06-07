package br.csi.padroes_revisao.PADROES_CRIACAO.AtividadeConstrutor2.factoryMethod;

import java.lang.reflect.InvocationTargetException;

public interface PrototypeFactory {

    Object copyFromPrototype (Object prototype) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException;
}
