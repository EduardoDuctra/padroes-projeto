package br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao01;

import java.lang.reflect.InvocationTargetException;

public interface Prototype {

    Object validade(Object prototype) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException;
}
