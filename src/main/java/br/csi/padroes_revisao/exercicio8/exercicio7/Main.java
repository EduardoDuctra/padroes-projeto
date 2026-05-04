package br.csi.padroes_revisao.exercicio8.exercicio7;

import br.csi.padroes_revisao.exercicio8.ValidacaoFramework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        DadosUsuario exemplo = new DadosUsuario();
        exemplo.setId(100000L);
        exemplo.setNome("Eduardo");
        exemplo.setEmail("eduardo.ductra@gmail.com");
        exemplo.setDataNascimento(LocalDate.of(1999, 2, 25));

        getJson(exemplo);

        System.out.println("Exercicio FRAMEWORK");
        ValidacaoFramework validacaoFramework = new ValidacaoFramework();
        validacaoFramework.validate(exemplo);

    }

    public static String getJson(Object obj) throws InvocationTargetException, IllegalAccessException {
        for(Method m : obj.getClass().getDeclaredMethods()) {
            if(m.getName().startsWith("get") && m.isAnnotationPresent(JSON.class)) {
                System.out.println(m.invoke(obj));
            }
        }

        return "";
    }
}
