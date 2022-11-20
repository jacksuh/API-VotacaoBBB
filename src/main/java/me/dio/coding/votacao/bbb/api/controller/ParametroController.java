package me.dio.coding.votacao.bbb.api.controller;

import me.dio.coding.votacao.bbb.api.repository.ParametroRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ParametroController {

    private final ParametroRepository repository;

    public ParametroController(ParametroRepository repository) {
        this.repository = repository;
    }
}

