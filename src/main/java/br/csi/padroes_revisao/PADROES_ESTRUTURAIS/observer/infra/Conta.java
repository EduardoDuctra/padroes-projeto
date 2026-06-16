package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer.infra;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer.Observable;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer.Observer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public abstract class Conta implements Observable {

    @EqualsAndHashCode.Include
    private Long numeroConta;

    private double saldo;

    private String cpf;

    private Collection<Movimentacao> movimentacoes = new ArrayList<>();

    private List<Observer> observers = new ArrayList<>();

    private TipoConta tipoConta;

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(this);
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        notificarObservers();
    }

    public abstract double getIRPF();

}