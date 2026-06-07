package br.csi.padroes_revisao.PADROES_CRIACAO.AtividadeConstrutor2.factoryMethod;

import br.csi.padroes_revisao.PADROES_CRIACAO.AtividadeConstrutor2.annotation.DeepCopy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Framework implements PrototypeFactory {
    @Override
    public Object copyFromPrototype(Object prototype) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {

        //cria um objeto do mesmo tipo/classe
        Class classe = prototype.getClass();


        Object copia = classe.newInstance();

        copiarAtributosPublicos(prototype, copia);
        copiarGetterSetter(prototype, copia);


        return copia;


    }

    public void copiarAtributosPublicos(Object original, Object clone) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {

        //cria um array com os campos
        Field[] atributos = original.getClass().getFields();

        //percorre os campos
        for (Field atributo : atributos) {

            //pego o valor da atributo do objeto original
            Object valor = atributo.get(original);

            //se tem a anotação e diferente de null
            if (atributo.isAnnotationPresent(DeepCopy.class) && valor != null) {

                //pego o valor e coloco no campo valor
                //recursiva -> copia profunda
                //sempre que tiver objeto dentro de objeto
                valor = copyFromPrototype(valor);

            }

            //passo para o clone o valor no atributo
            atributo.set(clone, valor);

        }

    }

    public void copiarGetterSetter(Object original, Object clone) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InstantiationException {

        //lista com os metodos
        Method[] metodos = original.getClass().getMethods();

        for (Method getter : metodos) {

            try {
                //METODOS GETTER
                //getParameterCount() == 0 ->
                if (getter.getName().startsWith("get")) {

                    //é para guardar o valor do que está naquele getter
                    Object valor = getter.invoke(original);


                    if (valor == null) {
                        continue;
                    }

                    //pega o nome do getter e corta o "get"
                    //exemplo: getId -> id
                    String nomeMetodo = getter.getName().substring(3);


                    //procurar o getter e o tipo de retorno
                    Method setter = original.getClass().getMethod("set" + nomeMetodo, getter.getReturnType());

                    //procurar o atributo
                    Field atributo = original.getClass().getDeclaredField(nomeMetodo.toLowerCase());


                    if (atributo.isAnnotationPresent(DeepCopy.class)) {

                        //pego o valor e coloco no campo valor
                        valor = copyFromPrototype(valor);

                    }

                    setter.invoke(clone, valor);
                }
            } catch (Exception ignored) {

            }

        }
    }


    public void copiarAtributosPrivados(Object original, Object clone) throws IllegalAccessException, NoSuchFieldException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        //cria um array com os campos
        Field[] atributos = original.getClass().getDeclaredFields();


        //percorre os campos
        for (Field atributo : atributos) {

            /**
             * liberar acesso campo privado
             */
            atributo.setAccessible(true);

            //pego o valor da atributo do objeto original
            Object valor = atributo.get(original);

            //se tem a anotação e diferente de null
            if (atributo.isAnnotationPresent(DeepCopy.class) && valor != null) {

                //pego o valor e coloco no campo valor
                //recursiva -> copia profunda
                //sempre que tiver objeto dentro de objeto
                valor = copyFromPrototype(valor);

            }

            //passo para o clone o valor no atributo
            atributo.set(clone, valor);

        }

    }


    public void copiarMetodosPrivados(Object original, Object clone) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InstantiationException {

        //lista com os metodos
        Method[] metodos = original.getClass().getDeclaredMethods();

        for (Method getter : metodos) {

            try {
                //METODOS GETTER
                //getParameterCount() == 0 ->
                if (getter.getName().startsWith("get")) {

                    /**
                     * liberar acesso campo privado
                     */
                    getter.setAccessible(true);

                    //é para guardar o valor do que está naquele getter
                    Object valor = getter.invoke(original);


                    if (valor == null) {
                        continue;
                    }

                    //pega o nome do getter e corta o "get"
                    //exemplo: getId -> id
                    String nomeMetodo = getter.getName().substring(3);


                    //procurar o getter e o tipo de retorno
                    Method setter = original.getClass().getDeclaredMethod("set" + nomeMetodo, getter.getReturnType());

                    /**
                     * liberar acesso campo privado
                     */
                    setter.setAccessible(true);

                    //procurar o atributo
                    Field atributo = original.getClass().getDeclaredField(nomeMetodo.toLowerCase());


                    if (atributo.isAnnotationPresent(DeepCopy.class)) {

                        //pego o valor e coloco no campo valor
                        valor = copyFromPrototype(valor);

                    }

                    setter.invoke(clone, valor);
                }
            } catch (Exception ignored) {

            }

        }
    }

}
