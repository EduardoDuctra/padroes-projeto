package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.logProxy;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.BancoInterface;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class LogBancoProxy implements InvocationHandler {

    private BancoInterface banco;
    private FileWriter fileWriter = new FileWriter("log.txt");

    public LogBancoProxy(BancoInterface banco) throws IOException {
        this.banco = banco;
    }

    private void escreverLog(String log, long millis){

        try {
            fileWriter.write("[BANCO]" + new Date() + ":" + log + "(" + millis + "ms)\n");
            fileWriter.flush();
        } catch (IOException e) {

        }


    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
