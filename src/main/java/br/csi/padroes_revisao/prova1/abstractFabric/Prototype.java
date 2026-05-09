package br.csi.padroes_revisao.prova1.abstractFabric;

import java.lang.reflect.InvocationTargetException;

public interface Prototype {

    Object clonePrototype() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

}
