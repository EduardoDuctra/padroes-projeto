package br.csi.padroes_revisao.exercicioAdapter;


import br.csi.padroes_revisao.exercicioAdapter.adapter.BancoAdapter;
import br.csi.padroes_revisao.exercicioAdapter.adapter.BancoAntigo;
import br.csi.padroes_revisao.exercicioAdapter.infra.Conta;
import br.csi.padroes_revisao.exercicioAdapter.infra.TipoConta;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
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

        BancoAntigo adapter = new BancoAdapter(banco);

        criarContas(adapter);

    }
    public static void criarContas(BancoAntigo adapter) {

        int numeroContas = 10000;
        long inicio = System.currentTimeMillis();


        for(int i=0; i<(numeroContas/3); i++){

            adapter.novaConta("corrente", 1000.0, false, (i * 1000.0));
            adapter.novaConta("poupanca", 1000.0, false, (i * 2000.0));
            adapter.novaConta("renda", 1000.0, true, (i * 2000.0));

        }

        long fim = System.currentTimeMillis();


        System.out.println("Contas criadas com sucesso!");
        System.out.println("Tempo para inserir todas as contas: " + (fim - inicio) + "ms");

    }

}
