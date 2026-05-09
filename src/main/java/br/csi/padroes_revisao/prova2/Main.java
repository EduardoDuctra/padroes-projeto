package br.csi.padroes_revisao.prova2;

import br.csi.padroes_revisao.prova2.exemplos.ClasseExemplo;
import br.csi.padroes_revisao.prova2.exemplos.ClasseExemplo2;
import br.csi.padroes_revisao.prova2.exemplos.ClasseExemplo3;
import br.csi.padroes_revisao.prova2.framework.Framework;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        PrototypeFactory factory = new Framework();

        ClasseExemplo original = new ClasseExemplo();
        original.setId(1L);
        original.setCodigo(10L);
        original.setAtributo1("Teste");

        original.atributo2 = "Publico";
        original.dataCriacao = new Date();


        ClasseExemplo2 exemplo2 = new ClasseExemplo2();
        exemplo2.setCodigo(20L);
        exemplo2.setNome("Objeto interno");


        ClasseExemplo3 exemplo3 = new ClasseExemplo3();
        exemplo3.setCodigo(30L);

        exemplo2.exemplo3 = exemplo3;

        original.setExemplo2(exemplo2);

        //fazendo a copia
        ClasseExemplo copia = (ClasseExemplo) factory.copyFromPrototype(original);


        //MOSTRAR RESULTADOS
        System.out.println("ORIGINAL:");
        System.out.println(original);

        System.out.println("\nCOPIA:");
        System.out.println(copia);

        //comparar referencias
        System.out.println("\nMesmo objeto?");
        System.out.println(original == copia);

        //deep copy
        System.out.println("\nMesmo exemplo2?");
        System.out.println(original.getExemplo2() == copia.getExemplo2());

        System.out.println("\nMesmo exemplo3?");
        System.out.println(
                original.getExemplo2().exemplo3 == copia.getExemplo2().exemplo3);

    }
}
