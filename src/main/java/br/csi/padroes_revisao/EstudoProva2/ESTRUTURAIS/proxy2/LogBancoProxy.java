package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.proxy2;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.BancoInterface;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * antes de chamar a classe Banco passa pelo Proxy
 * o proxy cria o registro no arquivo log.txt
 */
public class LogBancoProxy implements InvocationHandler {

    private BancoInterface banco;
    private FileWriter fileWriter = new FileWriter("log.txt");

    public LogBancoProxy(BancoInterface banco) throws IOException {
        this.banco = banco;
    }

    private void escreveLog(String log, long millis) {
        try {
            fileWriter.write("[BANCO]" + new Date() + ": " + log + "(" + millis + "ms)\n");
            fileWriter.flush();
        } catch (IOException e) {}
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long millis = System.currentTimeMillis();

        //chamo o metodo na classe banco
        Object ret = method.invoke(banco, args);
        millis = System.currentTimeMillis() - millis;
        escreveLog(method.getName(), millis);
        return ret;
    }
}
