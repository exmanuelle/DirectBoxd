package me.dio.directors.directboxd.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmeForm {

    private  long diretorId;
    private String nome;
    private LocalDate lancamento;
    private String linguagem;
    private double classificacao;
}
