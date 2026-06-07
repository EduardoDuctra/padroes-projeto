package br.csi.padroes_revisao.REVISAO.exercicio2;


import br.csi.padroes_revisao.REVISAO.exercicio2.infra.Conta;
import br.csi.padroes_revisao.REVISAO.exercicio2.infra.TipoConta;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {


        testarCriarContas("HashMap", new HashMap<>());
        testarCriarContas("LinkedHashMap", new LinkedHashMap<>());
        testarCriarContas("TreeMap", new TreeMap<>());
        testarCriarContas("ConcurrentHashMap", new ConcurrentHashMap<>());


    }

    public static void testarCriarContas(String nome, Map<Long, Conta> mapa){

        System.out.println("==== " + nome + " ====");
        Banco banco = new Banco(mapa);

        criarContas(banco);
        getContas(banco);

    }
    public static void criarContas(Banco banco) {

        int numeroContas = 10000;
        long inicio = System.currentTimeMillis();


        for(int i=0; i<(numeroContas/3); i++){

            banco.criarConta("12345"+i, 1000.0, TipoConta.CONTA_CORRENTE, false, (i*1000.0));
            banco.criarConta("678922"+i, 1000.0, TipoConta.POUPANCA, false, (i*2000.0));
            banco.criarConta("456738"+i, 1000.0, TipoConta.RENDA_VARIAVEL, true, (i*2000.0));

        }

        long fim = System.currentTimeMillis();


        System.out.println("Contas criadas com sucesso!");
        System.out.println("Tempo para inserir todas as contas: " + (fim - inicio) + "ms");

    }

    public static void getContas(Banco banco) {

        long inicio = System.currentTimeMillis();

        for(Conta conta: banco.getContas()){
//            System.out.println("[" + conta.getNumeroConta() +"] " + "Saldo: " + conta.getSaldo());
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo para percorrer todas as contas: " + (fim - inicio) + "ms");
    }
}
