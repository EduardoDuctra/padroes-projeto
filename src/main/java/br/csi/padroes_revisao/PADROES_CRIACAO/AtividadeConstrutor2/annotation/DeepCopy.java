package br.csi.padroes_revisao.PADROES_CRIACAO.AtividadeConstrutor2.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)

//copia a propriedade e os atributos dela
@Target({ElementType.METHOD,
        ElementType.FIELD})
public @interface DeepCopy {
}
