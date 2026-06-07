package br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.factory;

import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.Conta;

//Tirar a responsabilidade de criar objetos do Banco
public abstract class ContaFactory {

    public abstract Conta criarConta(String cpf, Double saldo, boolean especial, Double limite);

}