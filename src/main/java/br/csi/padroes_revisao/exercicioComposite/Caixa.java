package br.csi.padroes_revisao.exercicioComposite;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Caixa implements Item{

    private List<Item> intensCaixa = new ArrayList<>();


    public void adicionarProduto(Item item){
        intensCaixa.add(item);
    }

    @Override
    public double getPreco() {

        double valorTotal = 0;

        for(Item item : intensCaixa){
            valorTotal += item.getPreco();
        }

        return valorTotal;

    }
}
