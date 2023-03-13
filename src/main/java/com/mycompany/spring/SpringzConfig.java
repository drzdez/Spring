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
 * 
 * J.K. Added helloWorldUser prop, getter, setter
 *      Renamed "word" to "world"
 * 
 */
@Configuration
public class SpringzConfig {
    
    @Value(value = "${hello-world}")
    private String helloWorldMessage;
    
    public String getHelloWorldMessage(){
        return helloWorldMessage;
    }
        public void setHelloWordMessage(String helloWordMessage){
        this.helloWorldMessage = helloWorldMessage;
    }
    
    @Value(value = "${prop-user}")
    private String helloWorldUser;

    public String getHelloWorldUser()
    {
        return helloWorldUser;
    }
    
    public void setHelloWorldUse(String msg)
    {
        this.helloWorldUser = msg;
    }
    
    @Value(value = "${pyramid_width}")
    private Integer pyramid_width;
    
    public Integer getPyramidWidth(){
        return pyramid_width;
    }
    private String stars = "Attempting to print stars pyramid bellow:\n";
    
    public String printStarsPyramid(){
        var w = getPyramidWidth();
        if (w % 2 == 0){
            this.stars += "Width has to be odd number";
        }
        else {
            var zeros = (w-1)/2;
            var x = 1;
            for (int i=zeros; i>=0; i--){
                var spaces = new String(new char[i]).replace("\0", " ");
                var stars = new String(new char[x]).replace("\0", "*");
                this.stars += spaces+stars+"\n";
                x = x+2;
            }
        }
        return this.stars;
    }
}
