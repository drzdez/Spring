/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author zdraz
 */
@SpringBootApplication
public class SpringZApplication implements CommandLineRunner{

    private static final Logger logger = LogManager.getLogger(SpringZApplication.class);
    
    private final SpringZ springZ;

    public SpringZApplication(SpringZ springZ){
        this.springZ = springZ;
    }
        
    public static void main(String[] args) {
        SpringApplication.run(SpringZApplication.class, args);
    }
    
    @Override
    public void run(String... argz) {
        springZ.run();
    }
    
}
