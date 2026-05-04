package br.csi.padroes_revisao.factoryMethod.exercicio2.factory;

import br.csi.padroes_revisao.factoryMethod.exercicio2.infra.TipoConta;

//escolher qual fabrica usar de acordo com o tipo de conta
//recebe o tipo e decide qual factory chamar
public class ContaFactoryProvider {

    public static ContaFactory getFactory(TipoConta tipo){

        switch (tipo){

            case CONTA_CORRENTE:
                return new ContaCorrenteFactory();
            case POUPANCA:
                return new ContaPoupancaFactory();

            default:
                throw new IllegalArgumentException("Tipo de conta inválido: " + tipo);
        }

    }
}
