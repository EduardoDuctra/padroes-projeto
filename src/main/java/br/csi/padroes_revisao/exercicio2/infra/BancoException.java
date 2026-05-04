package br.csi.padroes_revisao.exercicio2.infra;

public class BancoException extends RuntimeException {
    public BancoException(String message) {
        super(message);
    }
}
