package br.csi.padroes_revisao.EstudoProva2.extra.composite.questao2;

public class Worker extends Employee {

    private double salary;

    public Worker(String nome, double salary) {
        super(nome);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
