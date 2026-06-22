package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Caixa implements Empacotavel {

   private Collection<Empacotavel>pacotes = new ArrayList<>();
   private Double precoCaixa;

    public Caixa(Double precoCaixa) {
        this.precoCaixa = precoCaixa;
    }

    @Override
    public Collection<Empacotavel> getPacotesContidos() {
        return this.pacotes;
    }

    @Override
    public Double getPreco() {
        double precoTotal = precoCaixa;

        for(Empacotavel pacote : pacotes) {
            precoTotal += pacote.getPreco();
        }
        return precoTotal;
    }
}
