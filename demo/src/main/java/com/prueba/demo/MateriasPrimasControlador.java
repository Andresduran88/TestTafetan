package com.prueba.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping(value = "/materiasprimas")

public class MateriasPrimasControlador {
    @Autowired
    private MateriasPrimasInterface intefaceMateriaPrima;

    @GetMapping
    public List<MateriasPrimas> MateriasPrimas() {
        return (List<MateriasPrimas>) intefaceMateriaPrima.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody MateriasPrimas us) {
        intefaceMateriaPrima.save(us);
    }

    @PutMapping
    public void Modificar(@RequestBody MateriasPrimas us) {
        intefaceMateriaPrima.save(us);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") String id) {
        intefaceMateriaPrima.deleteById(id);
    }
}
