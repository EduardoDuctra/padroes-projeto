package br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao03.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonIgnore {
    String msgErro()default "";

}
