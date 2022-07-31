package me.dio.directors.directboxd.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_diretores")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Diretor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate dataDeNascimento;

    private String nacionalidade;

    @OneToMany(mappedBy = "diretor", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Filme> filmes = new ArrayList<>();
}
