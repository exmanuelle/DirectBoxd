package me.dio.directors.directboxd.service.impl;

import me.dio.directors.directboxd.entity.Diretor;
import me.dio.directors.directboxd.entity.Filme;
import me.dio.directors.directboxd.entity.form.FilmeForm;
import me.dio.directors.directboxd.repository.DiretorRepository;
import me.dio.directors.directboxd.repository.FilmeRepository;
import me.dio.directors.directboxd.service.IFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeServiceImpl implements IFilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private DiretorRepository diretorRepository;

    @Override
    public Filme create(FilmeForm form) {

        Filme filme = new Filme();
        Diretor diretor = diretorRepository.findById(form.getDiretorId()).get();
        filme.setDiretor(diretor);
        filme.setNome(form.getNome());
        filme.setLancamento(form.getLancamento());
        filme.setLinguagem(form.getLinguagem());
        filme.setClassificacao(form.getClassificacao());

        return  filmeRepository.save(filme);
    }

    @Override
    public Filme get(Long id) {
        return null;
    }

    @Override
    public List<Filme> getAll() {
        return null;
    }

    @Override
    public Filme update(Long id, FilmeForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
