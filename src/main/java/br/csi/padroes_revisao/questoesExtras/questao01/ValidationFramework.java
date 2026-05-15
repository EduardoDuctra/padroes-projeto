package br.csi.padroes_revisao.questoesExtras.questao01;

import br.csi.padroes_revisao.exercicio8.ValidationException;
import br.csi.padroes_revisao.questoesExtras.questao01.anotacoes.NotNull;
import br.csi.padroes_revisao.questoesExtras.questao01.anotacoes.ValidateObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ValidationFramework implements Prototype {

    private Object prototype;

    public ValidationFramework(Object prototype) {

        this.prototype = prototype;

    }

    public void validar(Object prototype) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        if (prototype == null) {
            return;
        }

        Class classe = prototype.getClass();

        for (final Field f : classe.getDeclaredFields()) {
            f.setAccessible(true);

            Object valor = null;

            //acessar atributos publicos
            //PEGAR O VALOR DE UM ATRIBUTO PÚBLICO ASSIM
            if (Modifier.isPublic(f.getModifiers())) {
                valor = f.get(prototype);

            } else {

                //vou pegar o valor dos campos privados/GETTERs e validar eles
                String nomeGetter = "get"
                        + f.getName().substring(0, 1).toUpperCase()
                        + f.getName().substring(1);

                //pego o metodo. ex: getNome
                Method getter = prototype.getClass().getMethod(nomeGetter);

                //pego o valor dentro desse campo
                valor = getter.invoke(prototype);

            }

            if (f.isAnnotationPresent(NotNull.class)) {
                if (valor == null) {
                    throw new ValidationException(f.getName() + "nulo");
                }
            }

            if (f.isAnnotationPresent(ValidateObject.class)) {

                //evitar erro com o tipo String
                if(valor != null &&
                        !valor.getClass().getName().startsWith("java.")) {

                    //recursividade
                    validar(valor);
                }
            }

        }


    }

    @Override
    public Object validade(Object prototype) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        validar(prototype);
        return prototype;
    }
}
