package br.csi.padroes_revisao.factoryFramework;

public class ValidadorFactory {


    public static Validator getValidator(){

        return new ValidacaoFramework();
    }


}
