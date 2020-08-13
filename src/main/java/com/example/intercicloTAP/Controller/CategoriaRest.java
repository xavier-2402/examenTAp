/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intercicloTAP.Controller;

import com.example.intercicloTAP.Model.Categoria;
import com.example.intercicloTAP.Repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("categoria")
public class CategoriaRest {
    
     @Autowired
    CategoriaRepository categoriaRepository;
    
     @GetMapping("")
    @CrossOrigin
    public List<Categoria> listar() {
        return this.categoriaRepository.findAll();
    }

    @PostMapping("")
    @ResponseBody
    @CrossOrigin
    public Categoria guardar( @RequestBody Categoria c) {
        return this.categoriaRepository.save(c);
    }

    
}
