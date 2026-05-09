package br.csi.padroes_revisao.prova1.prototype;

import java.lang.reflect.InvocationTargetException;

public class TestCase {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        new TestCase().doTest();
    }

    public void doTest() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        //estou instanciando o objeto
        ObjExemplo objExemplo = ObjExemplo.getInstance();


        Prototype prototype = new ReflectionPrototype(objExemplo);

        //tenho o objeto -> criei um clone dele
        ObjExemplo clone = (ObjExemplo) prototype.clonePrototype();


        //teste 1
        assert clone != null;
        //teste 2
        assert clone != objExemplo;
        //teste 3
        assert clone.getSubObj() != null;
        //teste 4
        assert clone.getSubObj() == objExemplo.getSubObj();
        //teste 5
        assert clone.getMap() != null;
        //teste 6
        assert clone.getLista() != null;
        //teste 7
        assert clone.getLista() != objExemplo.getLista();
        //teste 8
        assert clone.getMap() != objExemplo.getMap();
    }

}