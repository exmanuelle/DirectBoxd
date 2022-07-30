package me.dio.directors.directboxd.service;

import me.dio.directors.directboxd.entity.Conta;
import me.dio.directors.directboxd.entity.form.ContaForm;

import java.util.List;

public interface IContaService {

    Conta create(ContaForm form);

    Conta get(Long id);

    List<Conta> getAll();

    Conta update(Long id,ContaForm formUpdate);

    void delete(Long id);
}
