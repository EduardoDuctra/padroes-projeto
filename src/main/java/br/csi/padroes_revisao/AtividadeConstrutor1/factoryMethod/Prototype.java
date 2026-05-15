package br.csi.padroes_revisao.AtividadeConstrutor1.factoryMethod;

import java.lang.reflect.InvocationTargetException;

public interface Prototype {

    Object clonePrototype(Object prototype) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException;

//    Object clonePrototype() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException;
}
