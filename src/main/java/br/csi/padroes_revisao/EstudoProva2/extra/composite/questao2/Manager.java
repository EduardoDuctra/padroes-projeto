package br.csi.padroes_revisao.EstudoProva2.extra.composite.questao2;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private double salary;
    private List<Employee> employees = new ArrayList<>();

    public Manager(String nome, double salary) {
        super(nome);
        this.salary = salary;
    }


    public void add (Employee e) {
        employees.add(e);
    }


    @Override
    public double getSalary() {
        double total = salary;

        for (Employee employee : employees) {
            total += employee.getSalary();
        }

        return total;
    }
}
