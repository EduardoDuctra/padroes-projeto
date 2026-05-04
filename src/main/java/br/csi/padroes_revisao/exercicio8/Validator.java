package br.csi.padroes_revisao.exercicio8;

public interface Validator {
    /**
     * Valida um objeto.
     *
     * @param obj O objeto a ser validado.
     * @throws ValidationException Se a validação falhar.
     */
    void validate(Object obj) throws ValidationException, IllegalAccessException;
}