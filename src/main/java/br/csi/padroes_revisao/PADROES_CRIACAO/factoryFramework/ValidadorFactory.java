package br.csi.padroes_revisao.PADROES_CRIACAO.factoryFramework;

public class ValidadorFactory {


    public static Validator getValidator(){

        return new ValidacaoFramework();
    }


}
