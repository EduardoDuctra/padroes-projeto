package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.observer;

import br.csi.padroes_revisao.REVISAO.exercicio2.infra.Movimentacao;
import br.csi.padroes_revisao.REVISAO.exercicio2.infra.TipoConta;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Collection;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public abstract class Conta implements Observable {

    @EqualsAndHashCode.Include
    private Long numeroConta;
    private double saldo;
    private String cpf;
    private Collection<Movimentacao>movimentacoes;
    private TipoConta tipoConta;

    private Collection<Observer> observers = new ArrayList<>();


    public void setSaldo(double saldo) {
        this.saldo = saldo;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }



    public abstract double getIRPF ();

    @Override
    public synchronized void subscribe(Observer observer) {
        observers.add(observer);

    }

    @Override
    public synchronized void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
}
