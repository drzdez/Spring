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
   
}
