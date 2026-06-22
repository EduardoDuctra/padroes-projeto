package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.composite;

import java.util.Collection;

/**
 * relação de hierarquia
 * um objeto que contem vários objetos
 */
public interface Empacotavel {

    Collection<Empacotavel> getPacotesContidos();
    Double getPreco();
}
