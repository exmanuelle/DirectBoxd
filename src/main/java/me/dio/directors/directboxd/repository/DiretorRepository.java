package me.dio.directors.directboxd.repository;

import me.dio.directors.directboxd.entity.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, Long> {




}
