package br.csi.padroes_revisao.exercicio7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)

//vai ser aplicado nos metodos
@Target(ElementType.METHOD)
public @interface JSON {
    String value() default "";
}
