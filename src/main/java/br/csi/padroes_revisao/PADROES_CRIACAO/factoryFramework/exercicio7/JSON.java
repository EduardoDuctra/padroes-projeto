package br.csi.padroes_revisao.PADROES_CRIACAO.factoryFramework.exercicio7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)

//vai ser aplicado nos metodos
@Target(ElementType.METHOD)
public @interface JSON {
    String value() default "";
    String dateFormat() default "dd/MM/yyyy HH:mm:ss";
}
