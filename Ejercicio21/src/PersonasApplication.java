package com.mintic.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonasApplication.class, args);
	}


        @Bean
        ApplicationRunner applicationRunner (RepositorioPersona repositorio){
            return args -> {
            
            final Log logger = LogFactory.getLog(getClass()); 
                
            logger.info("################### EJEMPLO SPRING DATA JDBC ###################");
            
            // Creamos 2 Objetos personas para agregarlos a la base de datos
            Persona persona1 = Persona.crearPersona("Juan", "Perez", "Médico", "Bogota");
            Persona persona2 = Persona.crearPersona("Maria", "Oviedo", "Física", "Medellín");
            
            // Agregamos los dos registros a la base de datos
            repositorio.save(persona1);
            repositorio.save(persona2);
                        
            // Listar Personas
            logger.info("Listar Personas: " + repositorio.findAll());
            
            // Contar registros en la BD
            logger.info("Cantidad de museos: " + repositorio.count());
            
            
            // Buscar persona con idPersona = 1
            logger.info("Persona id:1 " + repositorio.findById(1L).get());
           
            // Actualizar persona con idPersona = 2
            // Primero buscamos la persona que deseamos actualizar
            Persona persona3 = repositorio.findById(2L).get();
            
            // Actualizamos los atributos del objeto
            persona3.setNombre("Carlos");
            persona3.setApellido("Díaz");
            persona3.setCiudad("Cali");
            persona3.setProfesion("Abogado");
            
            // Actualizamos en BD
            repositorio.save(persona3);
            logger.info("Listar Personas: " + repositorio.findAll());


            // Eliminar persona con idPersona = 1
            repositorio.deleteById(1L);
            logger.info("Listar Personas: " + repositorio.findAll());

            };

    }
}