package br.csi.padroes_revisao.AtividadeConstrutor2.builder;

public class PrototypeDirector {

    public Object construirCopia(Object prototype) throws InstantiationException, IllegalAccessException {

        PrototypeBuilder builder = new ReflectionPrototypeBuilder();

        builder.criarNovoObjet(prototype);
        builder.copiarAtributisPublicos(prototype);
        builder.copiarGetterSetter(prototype);
        return builder.getObjet();

    }




}
