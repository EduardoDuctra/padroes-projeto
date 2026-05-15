package br.csi.padroes_revisao.AtividadeConstrutor2.builder;

import br.csi.padroes_revisao.AtividadeConstrutor2.annotation.DeepCopy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionPrototypeBuilder implements PrototypeBuilder {

    private Object clone;

    @Override
    public void criarNovoObjet(Object prototype) throws InstantiationException, IllegalAccessException {

        Class classe = prototype.getClass();
        clone = classe.newInstance();

    }

    @Override
    public void copiarAtributisPublicos(Object original) throws IllegalAccessException, InstantiationException {

        //cria um array com os campos
        Field[] atributos = original.getClass().getFields();

        //percorre os campos
        for(Field atributo : atributos) {

            //pego o valor da atributo do objeto original
            Object valor = atributo.get(original);

            //se tem a anotação e diferente de null
            if(atributo.isAnnotationPresent(DeepCopy.class) && valor !=null) {

                PrototypeDirector director = new PrototypeDirector();
                //pego o valor e coloco no campo valor
                valor = director.construirCopia(valor);

            }

            //passo para o clone o valor no atributo
            atributo.set(clone, valor);

        }

    }

    @Override
    public void copiarGetterSetter(Object original) {

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

                        PrototypeDirector director = new PrototypeDirector();
                        //pego o valor e coloco no campo valor
                        valor = director.construirCopia(valor);

                    }

                    setter.invoke(clone, valor);
                }
            } catch (Exception ignored) {

            }

        }
    }

    @Override
    public Object getObjet() {
        return clone;
    }
}
