/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intercicloTAP.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */

@Entity
@Table(name="evento")
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_evento;
    private String fecha;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    @JsonBackReference
    @JoinColumn(name="id_categoria")
    @ManyToOne(fetch=FetchType.LAZY)
    private Categoria categoria;

    public Evento() {
    }

    public Evento(Long id_evento, String fecha, String nombre, String descripcion, String ubicacion, Categoria categoria) {
        this.id_evento = id_evento;
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.categoria = categoria;
    }

    public Long getId_evento() {
        return id_evento;
    }

    public void setId_evento(Long id_evento) {
        this.id_evento = id_evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
