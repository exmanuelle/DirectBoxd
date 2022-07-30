package me.dio.directors.directboxd.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_filmes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate lancamento;

    private String linguagem;

    @Column(name="classificacao_atualo")
    private double classificacao;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diretor_id")
    private Diretor diretor;

}
