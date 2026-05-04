package br.csi.padroes_revisao.exercicio7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        DadosUsuario exemplo = new DadosUsuario();
        exemplo.setId(1L);
        exemplo.setNome("Julio");
        exemplo.setEmail("julio@gmail.com");

        getJson(exemplo);
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
