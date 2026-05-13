package br.csi.padroes_revisao.prova1.factoryMethod;

import java.lang.reflect.InvocationTargetException;

public class TestCase {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InstantiationException {
        new TestCase().doTest();
    }

    public void doTest() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InstantiationException {

        //estou instanciando o objeto
        ObjExemplo objExemplo = ObjExemplo.getInstance();

        //criando o prototipo chamando o factory
        Prototype prototype = ReflectionPrototypeRefatorado.PrototypeFactory.getPrototype(objExemplo);

        //tenho o objeto -> criei um clone dele
        ObjExemplo clone = (ObjExemplo) prototype.clonePrototype(objExemplo);


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