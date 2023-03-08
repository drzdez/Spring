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
        // System.out.println(springzCongig.getHelloWordMessage());
        SpringApplication.run(SpringZApplication.class, args);
        logger.info("App started!");
    }
    
    @Override
    public void run(String... argz) {
        springZ.run();
    }
    
}
