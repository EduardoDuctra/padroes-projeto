package br.csi.padroes_revisao.EstudoProva2.extra.composite.questao2;

public abstract class Employee {

    protected String nome;

    public Employee(String nome) {
        this.nome = nome;
    }

    public abstract double getSalary();

}
