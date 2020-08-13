/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intercicloTAP.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */

@Entity
@Table(name="categoria")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_categoria;
    private String nombre;
    private String orden;
    
     @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy="categoria")
     private List<Evento> eventos;

    public Categoria() {
    }

    public Categoria(Long id_categoria, String nombre, String orden, List<Evento> eventos) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.orden = orden;
        this.eventos = eventos;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
}
