package me.dio.directors.directboxd.repository;

import me.dio.directors.directboxd.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Long>{
}
