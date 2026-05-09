package br.csi.padroes_revisao.factoryFramework;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
