/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author zdraz
 */
@Configuration
public class SpringzConfig {
    
    @Value(value = "${hello-word}")
    private String helloWordMessage;
    
    
    public String getHelloWordMessage(){
        return helloWordMessage;
    }
    
    public void setHelloWordMessage(String helloWordMessage){
        this.helloWordMessage = helloWordMessage;
    }
}
