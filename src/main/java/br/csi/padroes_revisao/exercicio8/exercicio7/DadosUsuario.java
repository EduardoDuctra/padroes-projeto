package br.csi.padroes_revisao.exercicio8.exercicio7;


import br.csi.padroes_revisao.exercicio8.Validate;
import br.csi.padroes_revisao.exercicio8.anotacoes.Max;
import br.csi.padroes_revisao.exercicio8.anotacoes.Min;
import br.csi.padroes_revisao.exercicio8.anotacoes.NotNull;
import br.csi.padroes_revisao.exercicio8.anotacoes.Pattern;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Validate
public class DadosUsuario {

    @Min(min = 1, msgErro = "Valor maior que 1")
    @Max(max = 200, msgErro = "Valor menor que 200")
    @NotNull(msgErro = "Nao pode ser nulo")
    private Long id;

    @Pattern(regex = "^[A-Za-z]+$", msgErro = "Nomes somente com letras")
    private String nome;
    private String email;

    private LocalDate dataNascimento;


    @JSON
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JSON
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @JSON
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @JSON(dateFormat = "dd/MM/yyyy")
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
