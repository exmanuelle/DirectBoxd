package me.dio.directors.directboxd.controller;
import me.dio.directors.directboxd.entity.Conta;
import me.dio.directors.directboxd.entity.form.ContaForm;
import me.dio.directors.directboxd.service.impl.ContaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {
    @Autowired
    private ContaServiceImpl service;

    @PostMapping
    public Conta create(@Valid@RequestBody ContaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<Conta> getAll(@RequestParam(value = "usuario",required = false)String usuario){
        return service.getAll(usuario);
    }
}
