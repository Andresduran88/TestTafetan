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
@Table(name = "referencias_rollos")

public class ReferenciasRollos {

	@Id
	@Column
	private String referencia_rollo;

	@Column
	private int Ancho;

	@Column
	private String cinta_trama;

	@Column
	private int pasadas_trama;

	@Column
	private String cinta_urdimbre;

	@Column
	private int pasadas_urdimbre;

	@Column
	private double promedio_elongacion;

	public String getReferencia_rollo() {
		return referencia_rollo;
	}

	public void setReferencia_rollo(String referencia_rollo) {
		this.referencia_rollo = referencia_rollo;
	}

	public int getAncho() {
		return Ancho;
	}

	public void setAncho(int ancho) {
		Ancho = ancho;
	}

	public String getCinta_trama() {
		return cinta_trama;
	}

	public void setCinta_trama(String cinta_trama) {
		this.cinta_trama = cinta_trama;
	}

	public int getPasadas_trama() {
		return pasadas_trama;
	}

	public void setPasadas_trama(int pasadas_trama) {
		this.pasadas_trama = pasadas_trama;
	}

	public String getCinta_urdimbre() {
		return cinta_urdimbre;
	}

	public void setCinta_urdimbre(String cinta_urdimbre) {
		this.cinta_urdimbre = cinta_urdimbre;
	}

	public int getPasadas_urdimbre() {
		return pasadas_urdimbre;
	}

	public void setPasadas_urdimbre(int pasadas_urdimbre) {
		this.pasadas_urdimbre = pasadas_urdimbre;
	}

	public double getPromedio_elongacion() {
		return promedio_elongacion;
	}

	public void setPromedio_elongacion(double promedio_elongacion) {
		this.promedio_elongacion = promedio_elongacion;
	}

}
