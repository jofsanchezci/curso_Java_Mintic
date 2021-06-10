package com.mintic.demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author Juan
 */

@Table("Persona")
public class Persona {
    @Id
    @Column("id_persona")
    private Long idPersona;
    
    @Column("nombre")
    private String nombre;
    
    @Column("apellido")
    private String apellido;
    
    @Column("profesion")
    private String profesion;

    @Column("ciudad")
    private String ciudad;    

    private Persona(Long idPersona, String nombre, String apellido, String profesion, String ciudad) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.ciudad = ciudad;
    }
    
    public static Persona crearPersona(String nombre, String apellido, String profesion, String ciudad){
        return new Persona(null, nombre, apellido, profesion, ciudad);
    }
    
    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", profesion=" + profesion + ", ciudad=" + ciudad + '}';
    }
    
    
    
    
            
    
}
