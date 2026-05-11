package br.csi.padroes_revisao.prova1.factoryMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReflectionPrototype implements Prototype{

    //recebe um objeto
    private Object prototype;


    public ReflectionPrototype(Object prototype) {
        this.prototype = prototype;
    }

    @Override
    public Object clonePrototype() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        //invoca o metodo clone de prototype
        //clona
        Object objetoClonado = prototype.getClass().getMethod("clone").invoke(prototype);

        //percorrer os metodos do objeto
        for(Method m : objetoClonado.getClass().getMethods()) {

            //não entra se não for get
            //para pegar os atributos sempre tenho que usar o GET
            if(!m.getName().startsWith("get")){
                continue;
            }

            //obtenho o valor daquele metodo/valor do atributo do metodo
            Object valor = m.invoke(objetoClonado);

            //se for do tipo MAP
            //copia profunda MAP
            if(valor instanceof Map){

                Map copiaProfunda = new HashMap();
                copiaProfunda.putAll((Map) valor);

                //atribuir o valor no metodo
                // getter -> acho o setter dele e passo o valor
                Method setter = prototype.getClass().getMethod(
                        m.getName().replace("get", "set"),
                        m.getReturnType()
                );

                setter.invoke(objetoClonado, copiaProfunda);

            }

            //copia profunda LIST
            else if (valor instanceof List){

                List copiaProfundaLista = new ArrayList();
                copiaProfundaLista.addAll((List) valor);

                //atribuir o valor no metodo
                // getter -> acho o setter dele e passo o valor
                Method setter = prototype.getClass().getMethod(
                        m.getName().replace("get", "set"),
                        m.getReturnType()
                );

                setter.invoke(objetoClonado, copiaProfundaLista);

            }

        }
        return objetoClonado;
    }


    public static class PrototypeFactory {
        /**
         * Método fábrica responsável por instanciar ReflectionPrototype
         * encapsula a criação do objeto
         * centraliza a instanciação
         * evita que o usuário use new ReflectionPrototype()
         */
        public static Prototype getPrototype(Object object) {
            return new ReflectionPrototype(object);
        }

    }

}
