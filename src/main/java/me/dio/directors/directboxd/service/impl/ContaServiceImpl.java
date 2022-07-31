package me.dio.directors.directboxd.service.impl;

import me.dio.directors.directboxd.entity.Conta;
import me.dio.directors.directboxd.entity.form.ContaForm;
import me.dio.directors.directboxd.repository.ContaRepository;
import me.dio.directors.directboxd.service.IContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaServiceImpl implements IContaService {

    @Autowired
    private ContaRepository contaRepository;


    @Override
    public Conta create(ContaForm form) {
        return null;
    }

    @Override
    public Conta get(Long id) {
        return null;
    }

    @Override
    public List<Conta> getAll(String usuario) {
        if (usuario == null){
            return contaRepository.findAll();
        }else{
            return contaRepository.findByUsuario(usuario);
        }
    }

    @Override
    public Conta update(Long id, ContaForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
