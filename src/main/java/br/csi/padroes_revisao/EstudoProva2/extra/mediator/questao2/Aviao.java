package br.csi.padroes_revisao.EstudoProva2.extra.mediator.questao2;

import lombok.Data;

@Data
public class Aviao {

    private String nome;
    private TorreMediator torre;

    public Aviao(String nome, TorreMediator torre) {
        this.nome = nome;
        this.torre = torre;
    }

    public void solicitarPouso(){

        System.out.println(nome + " solicitou pouso.");
        torre.solicitarPouso(this);
    }
}
