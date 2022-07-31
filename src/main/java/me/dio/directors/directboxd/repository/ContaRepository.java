package me.dio.directors.directboxd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import me.dio.directors.directboxd.entity.Conta;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    List<Conta> findByUsuario(String usuario);
}
