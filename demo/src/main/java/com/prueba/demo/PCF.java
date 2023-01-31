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
@Table(name = "produccion_convertidura_tafetan")

public class PCF { // Produccion Convertidora tafetan

    @Id
    @Column
    private Integer id;

    @Column
    private String fecha;

    @Column
    private String automatica;

    @Column
    private String operario;

    @Column
    private String turno;

    @Column
    private double medida_corte;

    @Column
    private double medida_confenccion;

    @Column
    private String nrollo;

    @Column
    private double sacos_cortados;

    @Column
    private String Referencia;

    @Column
    private String Cliente;

    @Column
    private boolean Fuelle;

    @Column
    private boolean Microperforado;

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

    public String getAutomatica() {
        return automatica;
    }

    public void setAutomatica(String automatica) {
        this.automatica = automatica;
    }

    public String getOperario() {
        return operario;
    }

    public void setOperario(String operario) {
        this.operario = operario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getMedida_corte() {
        return medida_corte;
    }

    public void setMedida_corte(double medida_corte) {
        this.medida_corte = medida_corte;
    }

    public double getMedida_confenccion() {
        return medida_confenccion;
    }

    public void setMedida_confenccion(double medida_confenccion) {
        this.medida_confenccion = medida_confenccion;
    }

    public String getNrollo() {
        return nrollo;
    }

    public void setNrollo(String nrollo) {
        this.nrollo = nrollo;
    }

    public double getSacos_cortados() {
        return sacos_cortados;
    }

    public void setSacos_cortados(double sacos_cortados) {
        this.sacos_cortados = sacos_cortados;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String referencia) {
        Referencia = referencia;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public boolean isFuelle() {
        return Fuelle;
    }

    public void setFuelle(boolean fuelle) {
        Fuelle = fuelle;
    }

    public boolean isMicroperforado() {
        return Microperforado;
    }

    public void setMicroperforado(boolean microperforado) {
        Microperforado = microperforado;
    }

}
