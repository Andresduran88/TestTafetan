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
@Table(name = "produccion_tafetan_telares")
public class PTT { // Produccion Telares Tafetan;

	@Id
	@Column
	private Integer id;

	@Column
	private String fecha;

	@Column
	private String nombre_operario;

	@Column
	private String Turno;

	@Column
	private String Telar;

	@Column
	private double metros_tejidos;

	@Column
	private String Referencia;

	@Column
	private double horas_trabajadas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre_operario() {
		return nombre_operario;
	}

	public void setNombre_operario(String nombre_operario) {
		this.nombre_operario = nombre_operario;
	}

	public String getTurno() {
		return Turno;
	}

	public void setTurno(String turno) {
		Turno = turno;
	}

	public String getTelar() {
		return Telar;
	}

	public void setTelar(String telar) {
		Telar = telar;
	}

	public double getMetros_tejidos() {
		return metros_tejidos;
	}

	public void setMetros_tejidos(double metros_tejidos) {
		this.metros_tejidos = metros_tejidos;
	}

	public String getReferencia() {
		return Referencia;
	}

	public void setReferencia(String referencia) {
		Referencia = referencia;
	}

	public double getHoras_trabajadas() {
		return horas_trabajadas;
	}

	public void setHoras_trabajadas(double horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
	}

}
