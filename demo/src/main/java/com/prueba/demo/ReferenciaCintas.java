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
@Table(name = "referencias_cintas")
public class ReferenciaCintas {

	@Id
	@Column
	private String referencia_cinta;

	@Column
	private int Denier;

	@Column
	private String aditivo_1;

	@Column
	private double porcentaje_a1;

	@Column
	private String aditivo2;

	@Column
	private double porcentaje_a2;

	@Column
	private double porcentaje_carbonato;

	@Column
	private double Desviacion;

	public String getReferencia_cinta() {
		return referencia_cinta;
	}

	public void setReferencia_cinta(String referencia_cinta) {
		this.referencia_cinta = referencia_cinta;
	}

	public int getDenier() {
		return Denier;
	}

	public void setDenier(int denier) {
		Denier = denier;
	}

	public String getAditivo_1() {
		return aditivo_1;
	}

	public void setAditivo_1(String aditivo_1) {
		this.aditivo_1 = aditivo_1;
	}

	public double getPorcentaje_a1() {
		return porcentaje_a1;
	}

	public void setPorcentaje_a1(double porcentaje_a1) {
		this.porcentaje_a1 = porcentaje_a1;
	}

	public String getAditivo2() {
		return aditivo2;
	}

	public void setAditivo2(String aditivo2) {
		this.aditivo2 = aditivo2;
	}

	public double getPorcentaje_a2() {
		return porcentaje_a2;
	}

	public void setPorcentaje_a2(double porcentaje_a2) {
		this.porcentaje_a2 = porcentaje_a2;
	}

	public double getPorcentaje_carbonato() {
		return porcentaje_carbonato;
	}

	public void setPorcentaje_carbonato(double porcentaje_carbonato) {
		this.porcentaje_carbonato = porcentaje_carbonato;
	}

	public double getDesviacion() {
		return Desviacion;
	}

	public void setDesviacion(double desviacion) {
		Desviacion = desviacion;
	}
}
