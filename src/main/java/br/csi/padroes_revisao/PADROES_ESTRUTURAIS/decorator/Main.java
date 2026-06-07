package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator;


import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.infra.Conta;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.infra.TipoConta;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws IOException {


        testarCriarContas("HashMap", new HashMap<>());
        testarCriarContas("LinkedHashMap", new LinkedHashMap<>());
        testarCriarContas("TreeMap", new TreeMap<>());
        testarCriarContas("ConcurrentHashMap", new ConcurrentHashMap<>());


    }

    public static void testarCriarContas(String nome, Map<Long, Conta> mapa) throws IOException {

        System.out.println("==== " + nome + " ====");
        Banco bancoOriginal = new Banco(mapa);
        BancoInterface banco = new LogBancoDecorator(bancoOriginal);

        criarContas(banco);

    }
    public static void criarContas(BancoInterface  banco) {

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

}
