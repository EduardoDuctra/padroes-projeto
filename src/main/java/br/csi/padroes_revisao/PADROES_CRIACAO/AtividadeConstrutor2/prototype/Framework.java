package br.csi.padroes_revisao.PADROES_CRIACAO.AtividadeConstrutor2.prototype;

import br.csi.padroes_revisao.PADROES_CRIACAO.AtividadeConstrutor2.annotation.DeepCopy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Framework  {

    public Object clonePrototype(Object prototype) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {

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
        for(Field atributo : atributos) {

            //pego o valor da atributo do objeto original
            Object valor = atributo.get(original);

            //se tem a anotação e diferente de null
            if(atributo.isAnnotationPresent(DeepCopy.class) && valor !=null) {

                //pego o valor e coloco no campo valor
                valor = clonePrototype(valor);

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

                    //procurar o atributo
                    Field atributo = original.getClass().getDeclaredField(nomeMetodo.toLowerCase());


                    if(atributo.isAnnotationPresent(DeepCopy.class)){

                        //pego o valor e coloco no campo valor
                        valor = clonePrototype(valor);

                    }

                    setter.invoke(clone, valor);
                }
            } catch (Exception ignored) {

            }

        }
    }
}
