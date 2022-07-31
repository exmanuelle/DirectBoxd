package me.dio.directors.directboxd.service.impl;

import me.dio.directors.directboxd.entity.Diretor;
import me.dio.directors.directboxd.entity.Filme;
import me.dio.directors.directboxd.entity.form.DiretorForm;
import me.dio.directors.directboxd.repository.DiretorRepository;
import me.dio.directors.directboxd.service.IDiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretorServiceImpl implements IDiretorService {

    @Autowired
    private DiretorRepository repository;

    @Override
    public Diretor create(DiretorForm form) {
        Diretor diretor = new Diretor();
        diretor.setNome(form.getNome());
        diretor.setDataDeNascimento(form.getDataDeNascimento());
        diretor.setNacionalidade(form.getNacionalidade());

        return repository.save(diretor);
    }

    @Override
    public Diretor get(Long id) {
        return null;
    }

    @Override
    public List<Diretor> getAll() {
        return repository.findAll();
    }

    @Override
    public Diretor update(Long id, DiretorForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Filme> getAllFilmeId(Long id) {
        Diretor diretor = repository.findById(id).get();
        return diretor.getFilmes();
    }

}
