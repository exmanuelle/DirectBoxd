package me.dio.directors.directboxd.entity.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class ContaForm {

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long DiretorId;

    @NotNull(message = "Preencha o campo corretamente.")
    private String email;

    @NotNull(message = "Preencha o campo corretamente.")
    private String usuario;

    @NotBlank
    @Size(min = 8, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String senha;


}
