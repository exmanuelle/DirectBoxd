package me.dio.directors.directboxd.controller;

import me.dio.directors.directboxd.entity.Filme;
import me.dio.directors.directboxd.entity.form.FilmeForm;
import me.dio.directors.directboxd.service.impl.FilmeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeServiceImpl service;

    @PostMapping
    public Filme create (@Valid @RequestBody FilmeForm form){
        return service.create(form);
    }

}
