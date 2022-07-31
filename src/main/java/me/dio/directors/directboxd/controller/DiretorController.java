package me.dio.directors.directboxd.controller;

import me.dio.directors.directboxd.entity.Diretor;
import me.dio.directors.directboxd.entity.Filme;
import me.dio.directors.directboxd.entity.form.DiretorForm;
import me.dio.directors.directboxd.service.impl.DiretorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    @Autowired
    private DiretorServiceImpl service;

    @GetMapping
    public List<Diretor>getAll(){
       return service.getAll();
    }

    @PostMapping
    public Diretor create(@Valid @RequestBody DiretorForm form){
        return  service.create(form);
    }

    @GetMapping("/filmes/{id}")
    public List<Filme> getAllFilmeId(@PathVariable Long id){
        return service.getAllFilmeId(id);
    }
}
