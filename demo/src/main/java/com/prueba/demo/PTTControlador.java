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
@RequestMapping(value = "/PTT")
public class PTTControlador {

	@Autowired
	private PTTInterface x;

	@GetMapping
	public List<PTT> MateriasPrimas() {
		return (List<PTT>) x.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody PTT us) {
		x.save(us);
	}

	@PutMapping
	public void Modificar(@RequestBody PTT us) {
		x.save(us);
	}

	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		x.deleteById(id);
	}

}
