package com.learning.first;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")// setting profile at class level
public class ApplicationConfig {

    @Bean("bean1")
   // @Profile("dev")// setting profile at method level
    public MyFirstClass myFirstClass(){
        return new MyFirstClass("FirstBean");
    }

    @Bean("bean2")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("Second Bean");
    }
}
