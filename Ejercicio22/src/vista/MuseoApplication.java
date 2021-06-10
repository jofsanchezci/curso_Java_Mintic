/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;
import modelo.Museo;
import modelo.RepositorioMuseo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

/**
 *
 * @author Juan
 */
 @SpringBootApplication
 @ComponentScan("modelo") 
 @EnableJdbcRepositories("modelo")

public class MuseoApplication {
        
        @Autowired
        RepositorioMuseo repositorioMuseo;
     
	public static void main(String[] args) {
		//SpringApplication.run(MuseoApplication.class, args);
                SpringApplicationBuilder builder = new SpringApplicationBuilder(MuseoApplication.class);
                builder.headless(false);
                ConfigurableApplicationContext context = builder.run(args);
	}
        
        @Bean
        ApplicationRunner applicationRunner (){
            return args -> {
            
            Vista vista = new Vista();

            Controlador controlador = new Controlador(repositorioMuseo, vista);
            
            
            };

    }
}
