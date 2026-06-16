package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer.infra;

public class BancoException extends RuntimeException {
    public BancoException(String message) {
        super(message);
    }
}
