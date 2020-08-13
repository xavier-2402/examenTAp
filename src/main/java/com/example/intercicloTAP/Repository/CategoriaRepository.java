/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intercicloTAP.Repository;

import com.example.intercicloTAP.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author usuario
 */
public interface CategoriaRepository  extends JpaRepository<Categoria,Long>{
    
}
