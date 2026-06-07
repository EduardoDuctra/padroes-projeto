package br.csi.padroes_revisao.PADROES_CRIACAO.AtividadeConstrutor1.abstractFabric;

import java.lang.reflect.InvocationTargetException;

public interface Prototype {

    Object clonePrototype() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

}
