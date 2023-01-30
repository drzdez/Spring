/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author zdraz
 */
@Component
public class SpringZ {
    
    private static final Logger logger = LogManager.getLogger(SpringZApplication.class);
    
    SpringzConfig springzConfig;
    
    @Autowired
    public SpringZ(SpringzConfig springzConfig){
         this.springzConfig = springzConfig;
    }
    
    public void run(){
        logger.info(springzConfig.getHelloWordMessage());
    }
    
    
}
