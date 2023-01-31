package com.prueba.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Entity
@Table(name = "materiasprimas")
public class MateriasPrimas {

	@Id
	@Column(length = 10)
	private String nombreaditivos;

	public String getNombreAditivo() {
		return nombreaditivos;
	}

	public void setNombreAditivo(String NombreAditivo) {
		this.nombreaditivos = NombreAditivo;
	}

}
