
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
@Table(name = "entradarollostafetan")
public class EntradaRollosTafetan {

    @Id
    @Column
    private String nrollo;

    @Column // Corregir a Fecha
    private String Fecha;

    @Column
    private String turno;

    @Column
    private String Referencia;

    @Column
    private double peso;

    @Column
    private double metros;

    @Column
    private String telar;

    @Column
    private String control;

    @Column
    private String observacion;

    public String getNrollo() {
        return nrollo;
    }

    public void setNrollo(String nrollo) {
        this.nrollo = nrollo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String referencia) {
        Referencia = referencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getTelar() {
        return telar;
    }

    public void setTelar(String telar) {
        this.telar = telar;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
