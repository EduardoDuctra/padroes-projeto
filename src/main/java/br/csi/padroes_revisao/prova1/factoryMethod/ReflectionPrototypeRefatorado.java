package br.csi.padroes_revisao.prova1.factoryMethod;

import br.csi.padroes_revisao.prova2.annotation.DeepCopy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReflectionPrototypeRefatorado implements Prototype{

    //recebe um objeto
    private Object prototype;


    public ReflectionPrototypeRefatorado(Object prototype) {
        this.prototype = prototype;

    }


    @Override
    public Object clonePrototype(Object prototype) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //invoca o metodo clone de prototype
        //clona
        Object objetoClonado = prototype.getClass().getMethod("clone").invoke(prototype);

        copiarAtributosPublicos(prototype,objetoClonado);
        copiarAtributosPrivados(prototype,objetoClonado);
        copiarGetterSetter(prototype,objetoClonado);
        copiarMetodosPrivados(prototype,objetoClonado);

        return objetoClonado;
    }




    public void copiarAtributosPublicos(Object original, Object clone) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {

        //cria um array com os campos
        Field[] atributos = original.getClass().getFields();

        //percorre os campos
        for(Field atributo : atributos) {


            //pego o valor da atributo do objeto original
            Object valor = atributo.get(original);

            //COPIA PROFUNDA MAP
            if(valor instanceof Map){

                Map copiaMap = new HashMap();
                copiaMap.putAll((Map) valor);

                valor = copiaMap;
            }

            //COPIA PROFUNDA LIST
            else if(valor instanceof List){

                List copiaLista = new ArrayList();
                copiaLista.addAll((List) valor);

                valor = copiaLista;
            }



            //passo para o clone o valor no atributo
            atributo.set(clone, valor);

        }

    }

    public void copiarGetterSetter(Object original, Object clone) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InstantiationException {

        //lista com os metodos
        Method[] metodos  = original.getClass().getMethods();

        for(Method getter: metodos){

            try {
                //METODOS GETTER
                //getParameterCount() == 0 ->
                if(getter.getName().startsWith("get")){

                    //é para guardar o valor do que está naquele getter
                    Object valor = getter.invoke(original);


                    if(valor == null){
                        continue;
                    }

                    //pega o nome do getter e corta o "get"
                    //exemplo: getId -> id
                    String nomeMetodo = getter.getName().substring(3);


                    //procurar o getter e o tipo de retorno
                    Method setter = original.getClass().getMethod("set"+nomeMetodo, getter.getReturnType());



                    //COPIA PROFUNDA MAP
                    if(valor instanceof Map){

                        Map copiaMap = new HashMap();
                        copiaMap.putAll((Map) valor);

                        valor = copiaMap;
                    }

                    //COPIA PROFUNDA LIST
                    else if(valor instanceof List){

                        List copiaLista = new ArrayList();
                        copiaLista.addAll((List) valor);

                        valor = copiaLista;
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
        for(Field atributo : atributos) {

            /**
             * liberar acesso campo privado
             */
            atributo.setAccessible(true);

            //pego o valor da atributo do objeto original
            Object valor = atributo.get(original);


            //COPIA PROFUNDA MAP
            if(valor instanceof Map){

                Map copiaMap = new HashMap();
                copiaMap.putAll((Map) valor);

                valor = copiaMap;
            }

            //COPIA PROFUNDA LIST
            else if(valor instanceof List){

                List copiaLista = new ArrayList();
                copiaLista.addAll((List) valor);

                valor = copiaLista;
            }


            //passo para o clone o valor no atributo
            atributo.set(clone, valor);

        }

    }



    public void copiarMetodosPrivados(Object original, Object clone) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InstantiationException {

        //lista com os metodos
        Method[] metodos  = original.getClass().getDeclaredMethods();

        for(Method getter: metodos){

            try {
                //METODOS GETTER
                //getParameterCount() == 0 ->
                if(getter.getName().startsWith("get")){

                    /**
                     * liberar acesso campo privado
                     */
                    getter.setAccessible(true);

                    //é para guardar o valor do que está naquele getter
                    Object valor = getter.invoke(original);


                    if(valor == null){
                        continue;
                    }

                    //pega o nome do getter e corta o "get"
                    //exemplo: getId -> id
                    String nomeMetodo = getter.getName().substring(3);


                    //procurar o getter e o tipo de retorno
                    Method setter = original.getClass().getDeclaredMethod("set"+nomeMetodo, getter.getReturnType());

                    /**
                     * liberar acesso campo privado
                     */
                    setter.setAccessible(true);


                    //COPIA PROFUNDA MAP
                    if(valor instanceof Map){

                        Map copiaMap = new HashMap();
                        copiaMap.putAll((Map) valor);

                        valor = copiaMap;
                    }

                    //COPIA PROFUNDA LIST
                    else if(valor instanceof List){

                        List copiaLista = new ArrayList();
                        copiaLista.addAll((List) valor);

                        valor = copiaLista;
                    }


                    setter.invoke(clone, valor);
                }
            } catch (Exception ignored) {

            }

        }
    }



    public static class PrototypeFactory {
        /**
         * Método fábrica responsável por instanciar ReflectionPrototype
         * encapsula a criação do objeto
         * centraliza a instanciação
         * evita que o usuário use new ReflectionPrototype()
         */
        public static Prototype getPrototype(Object object) {
            return new ReflectionPrototypeRefatorado(object);
        }

    }

}
