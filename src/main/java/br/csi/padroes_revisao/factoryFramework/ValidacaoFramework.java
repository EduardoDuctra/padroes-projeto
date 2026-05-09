package br.csi.padroes_revisao.factoryFramework;

import br.csi.padroes_revisao.factoryFramework.anotacoes.Max;
import br.csi.padroes_revisao.factoryFramework.anotacoes.Min;
import br.csi.padroes_revisao.factoryFramework.anotacoes.NotNull;
import br.csi.padroes_revisao.factoryFramework.anotacoes.Pattern;

import java.lang.reflect.Field;

public class ValidacaoFramework implements Validator {

    @Override
    public void validate(Object obj) throws ValidationException, IllegalAccessException {

        //se nao tiver a anotacao -> nem entra
        if(!obj.getClass().isAnnotationPresent(Validate.class)){
            return;
        }

        //percorrer os campos da classe
        for(Field field : obj.getClass().getDeclaredFields()){
            field.setAccessible(true);

            /**
             * entra nos atributos com anotação NotNull
             * verifica se o obj é null
             */
        if(field.isAnnotationPresent(NotNull.class)){
            NotNull annotation = field.getAnnotation(NotNull.class);
                if(field.get(obj) == null){
                    throw new ValidationException("[" + field.getName() + "]" + annotation.msgErro());
                }
            }

            /**
             * entra nos atributos com anotação Min
             * verifica se o obj é null
             * verifica se é mmenor que o valor min do framework
             */
        if(Number.class.isAssignableFrom(field.getType())){
            if(field.isAnnotationPresent(Min.class)){
                Min min = field.getAnnotation(Min.class);
                Number valor = (Number) field.get(obj);

                if(valor == null){
                    return;
                }

                if(valor.doubleValue() < min.min()){
                    throw new ValidationException("[" + field.getName() + "]" + min.msgErro());
                }

            }
        }


            /**
             * entra nos atributos com anotação Min
             * verifica se o obj é null
             * verifica se é maior que o valor max do framework
             */
            if(Number.class.isAssignableFrom(field.getType())){
                if(field.isAnnotationPresent(Max.class)){
                    Max max = field.getAnnotation(Max.class);
                    Number valor = (Number) field.get(obj);

                    if(valor == null){
                        return;
                    }

                    if(valor.doubleValue() > max.max()){
                        throw new ValidationException("[" + field.getName() + "]" + max.msgErro());
                    }

                }
            }

            /**
             * entra nos atributos com anotação Pattern
             * verifica se o obj é null
             * pega o objeto de dentro do campo
             * verifica se está dentro do regex
             */
            else if(field.getType() == String.class && field.isAnnotationPresent(Pattern.class)){

                String valor = (String) field.get(obj);

                if(valor == null){
                    return;
                }

                Pattern pattern = (Pattern) field.getAnnotation(Pattern.class);

                    if(!valor.matches(pattern.regex())){
                        throw new ValidationException("[" + field.getName() + "]" + pattern.msgErro());
                    }


                } else if (field.getType().isAnnotationPresent(Validate.class) && field.get(obj) !=null){

                validate(field.get(obj));
            }
        }

        }
    }

