package br.csi.padroes_revisao.exercicioDecorator.infra;

public class BancoException extends RuntimeException {
    public BancoException(String message) {
        super(message);
    }
}
