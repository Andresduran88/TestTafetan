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
@Table(name = "salidarollostafetan")

public class salidarollostafetan {

	@Id
	@Column
	private Integer nsalida;

	@Column
	private String fechasalida;

	@Column
	private String nrollo;

	@Column
	private String referencia;

	@Column
	private String destino;

	public Integer getNsalida() {
		return nsalida;
	}

	public String getFechasalida() {
		return fechasalida;
	}

	public String getNrollo() {
		return nrollo;
	}

	public String getReferencial() {
		return referencia;
	}

	public String getDestino() {
		return destino;

	}

	public void setNsalida(Integer nsalida) {
		this.nsalida = nsalida;
	}

	public void setFechasalida(String fechasalida) {
		this.fechasalida = fechasalida;
	}

	public void setNrollo(String nrollo) {
		this.nrollo = nrollo;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
