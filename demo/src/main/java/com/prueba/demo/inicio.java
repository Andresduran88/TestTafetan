package com.prueba.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@RequestMapping("/")

public class inicio {

    @GetMapping
    public String hello() {
        return "Inicio Consola";
    }

}
