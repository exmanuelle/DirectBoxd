package me.dio.directors.directboxd.service;

import me.dio.directors.directboxd.entity.Diretor;
import me.dio.directors.directboxd.entity.Filme;
import me.dio.directors.directboxd.entity.form.DiretorForm;

import java.util.List;

public interface IDiretorService {

    Diretor create(DiretorForm form);

    Diretor get(Long id);

    List<Diretor> getAll();

    Diretor update(Long id,DiretorForm formUpdate);

    void delete(Long id);

    List<Filme> getAllFilmeId(Long id);
}
