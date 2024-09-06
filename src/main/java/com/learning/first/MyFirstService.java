package com.learning.first;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service

public class MyFirstService {
    private final MyFirstClass myFirstClass;

    @Value("${spring.application.name}")// when we read from application.properties we don't need to specify the @PropertySource
    private String customProperty;




    @Autowired
    public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass){

        this.myFirstClass= myFirstClass;
    }
    public String tellAStory(){

        return "the dependency is saying: " + myFirstClass.sayHello();
    }

    public String getCustomProperty() {
        return customProperty;
    }
}
