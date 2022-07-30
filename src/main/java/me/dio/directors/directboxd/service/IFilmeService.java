package me.dio.directors.directboxd.service;

import me.dio.directors.directboxd.entity.Filme;
import me.dio.directors.directboxd.entity.form.FilmeForm;

import java.util.List;

public interface IFilmeService {

    Filme create(FilmeForm form);

    Filme get(Long id);

    List<Filme> getAll();

    Filme update(Long id, FilmeForm formUpdate);

    void delete(Long id);
}
