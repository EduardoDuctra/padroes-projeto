package br.csi.padroes_revisao.prova1.builder;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Builder {

    private ObjExemplo object = new ObjExemplo();


    public Builder nome(String nome) {
        object.setNome(nome);
        return this;
    }


    public Builder idade(Integer idade){
        object.setIdade(idade);
        return this;
    }

    public Builder objetoInterno(
            ObjExemplo.InnerClassExample subObj){
        object.setSubObj(subObj);
        return this;
    }

    //copia profunda da lista
    //rasa elementos
    public Builder lista(List<String> lista){

        List<String>novaLista = new ArrayList<>();
        novaLista.addAll(lista);

        object.setLista(novaLista);
        return this;
    }

    public Builder map(Map<String,ObjExemplo.InnerClassExample> map){

        Map<String,ObjExemplo.InnerClassExample>novoMap = new HashMap<>();
        novoMap.putAll(map);

        object.setMap(novoMap);
        return this;
    }

    public ObjExemplo build(){
        return object;
    }





}
