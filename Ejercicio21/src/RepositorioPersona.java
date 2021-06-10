/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.demo;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Juan
 */
public interface RepositorioPersona extends CrudRepository<Persona, Long>{
    
}
