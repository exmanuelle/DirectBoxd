package me.dio.directors.directboxd.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Diretor {
    private Long id;
    private String nome;
    private LocalDate dataDeNascimento;
    private String nacionalidade;
    private List<Filme> filmes = new ArrayList<>();
}
