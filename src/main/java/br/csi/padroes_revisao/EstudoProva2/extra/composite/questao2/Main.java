package br.csi.padroes_revisao.EstudoProva2.extra.composite.questao2;

public class Main {

    public static void main(String[] args) {

        Worker f1 = new Worker("João", 3000);
        Worker f2 = new Worker("Maria", 3500);
        Worker f3 = new Worker("Carlos", 2800);

        Manager gerenteTI = new Manager("Ana", 7000);
        gerenteTI.add(f1);
        gerenteTI.add(f2);

        Manager diretor = new Manager("Pedro", 12000);
        diretor.add(gerenteTI);
        diretor.add(f3);

        System.out.println("Departamento TI: R$ "
                + gerenteTI.getSalary());

        System.out.println("Empresa: R$ "
                + diretor.getSalary());

    }
}