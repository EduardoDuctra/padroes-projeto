package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer.infra.Conta;

import java.util.ArrayList;
import java.util.List;

public class SerasaObserver implements Observer {

    private List<String> negativados = new ArrayList<>();

    @Override
    public void atualizar(Conta conta) {

        if(conta.getSaldo() < 0){

            if(!negativados.contains(conta.getCpf())){

                negativados.add(conta.getCpf());

                System.out.println("Cliente negativado: "
                        + conta.getCpf());
            }
        }
    }
}