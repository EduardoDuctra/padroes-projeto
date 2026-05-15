package br.csi.padroes_revisao.AtividadeConstrutor1.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjExemplo implements Cloneable {

    private String nome;
    private Integer idade;
    private InnerClassExample subObj;
    private List<String> lista = new ArrayList<>();
    private Map<String, InnerClassExample> map = new HashMap<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public InnerClassExample getSubObj() {
        return subObj;
    }

    public void setSubObj(InnerClassExample subObj) {
        this.subObj = subObj;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public Map<String, InnerClassExample> getMap() {
        return map;
    }

    public void setMap(Map<String, InnerClassExample> map) {
        this.map = map;
    }

    public static ObjExemplo getInstance() {
        ObjExemplo obj = new ObjExemplo();
        obj.setIdade(18);
        obj.setNome("Fulano");
        InnerClassExample inner1 = new InnerClassExample("inner 1");
        InnerClassExample inner2 = new InnerClassExample("inner 2");
        InnerClassExample inner3 = new InnerClassExample("inner 3");
        InnerClassExample inner4 = new InnerClassExample("inner 4");
        obj.setSubObj(inner1);
        obj.getLista().add("str1");
        obj.getLista().add("str2");
        obj.getMap().put("inner2", inner2);
        obj.getMap().put("inner3", inner3);
        obj.getMap().put("inner4", inner4);
        return obj;
    }

    @Override
    public ObjExemplo clone() {
        try {
            ObjExemplo clone = (ObjExemplo) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class InnerClassExample {
        private String innerField;

        public InnerClassExample(String innerField) {
            this.innerField = innerField;
        }

        public String getInnerField() {
            return innerField;
        }

        public void setInnerField(String innerField) {
            this.innerField = innerField;
        }
    }

}
