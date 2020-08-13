/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intercicloTAP.Controller;

import com.example.intercicloTAP.Model.Evento;
import com.example.intercicloTAP.Repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("evento")
public class EventoRest {
    
    
      
    @Autowired
    EventoRepository eventoRepository;
    
     @GetMapping("")
    @CrossOrigin
    public List<Evento> listar() {
        return this.eventoRepository.findAll();
    }

    @PostMapping("")
    @CrossOrigin
    public Evento guardar(@RequestBody Evento e) {
        return this.eventoRepository.save(e);
    }

    @GetMapping("/{idEvento}")
    @CrossOrigin
    public Evento recuperar(@PathVariable Long idEvento) {
        return this.eventoRepository.findById(idEvento).get();
    }
    
   

    @DeleteMapping("/{idEvento}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idEvento) {
        this.eventoRepository.deleteById(idEvento);
    }
    
}
