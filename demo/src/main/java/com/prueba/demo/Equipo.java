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
@Table(name = "equipo")
public class Equipo {
    @Id
    @Column
    private String nombreequipo;

    @Column
    private String tipo;

    @Column
    private String modelo;

    @Column
    private double eficienciamaxima;

    @Column
    private double eficienciaesperada;

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getEficienciamaxima() {
        return eficienciamaxima;
    }

    public void setEficienciamaxima(double eficienciamaxima) {
        this.eficienciamaxima = eficienciamaxima;
    }

    public double getEficienciaesperada() {
        return eficienciaesperada;
    }

    public void setEficienciaesperada(double eficienciaesperada) {
        this.eficienciaesperada = eficienciaesperada;
    }

}
