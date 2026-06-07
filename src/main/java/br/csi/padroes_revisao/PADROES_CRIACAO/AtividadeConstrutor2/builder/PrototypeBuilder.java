package br.csi.padroes_revisao.PADROES_CRIACAO.AtividadeConstrutor2.builder;

public interface PrototypeBuilder {

    void criarNovoObjet(Object prototype) throws InstantiationException, IllegalAccessException;
    void copiarAtributisPublicos(Object original) throws IllegalAccessException, InstantiationException;
    void copiarGetterSetter(Object original);
    Object getObjet();

}
