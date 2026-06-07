package br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao03;

import br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao03.anotacoes.JsonDeep;
import br.csi.padroes_revisao.PADROES_CRIACAO.questoesExtras.questao03.anotacoes.JsonIgnore;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ValidacaoFramework implements Prototype{
    @Override
    public void validarFrameword(Object prototype) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        String json = serializarObjeto(prototype);
        System.out.println(json);

    }

    public String serializarObjeto(Object prototype) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        if(prototype == null){
            return "null";
        }

        StringBuilder json = new StringBuilder();
        json.append("{");
        boolean primeiro = true;

        //percorrer os campos
        for(Field f: prototype.getClass().getDeclaredFields()){
            f.setAccessible(true);

            if(f.isAnnotationPresent(JsonIgnore.class)){
                continue;
            }

            Object valorCampo;

            //pegando o valor do campo
            if(Modifier.isPublic(f.getModifiers())){
                valorCampo = f.get(prototype);

            } else {

                //vou pegar o valor dos campos privados/GETTERs e validar eles
                String nomeGetter = "get"
                        + f.getName().substring(0, 1).toUpperCase()
                        + f.getName().substring(1);

                //pego o metodo. ex: getNome
                Method getter = prototype.getClass().getMethod(nomeGetter);

                //pego o valor dentro desse campo
                valorCampo = getter.invoke(prototype);
            }

            if(!primeiro){
                json.append(",");
            }

            json.append("\"").append(f.getName()).append("\":");

            if(valorCampo instanceof String){

                json.append("\"")
                        .append(valorCampo)
                        .append("\"");
            }

            else if(f.isAnnotationPresent(JsonDeep.class)){
                json.append(serializarObjeto(valorCampo));
            }
            else{
                json.append(valorCampo);
            }

            primeiro = false;


        }

        json.append("}");

        return json.toString();

    }
}
