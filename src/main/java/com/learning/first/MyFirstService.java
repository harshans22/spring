package com.learning.first;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
//@PropertySource("classpath:custom.properties")// this tell spring to load properties file from custom properties file created by you
@PropertySources(
    {
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom2.properties"),//if two properties file have same key then the last one will be used

    }
)
public class MyFirstService {
    private final MyFirstClass myFirstClass;

    @Value("hello harsh student")
    private String customProperty;

    @Value("${my.prop}")//when u use this always use @PropertySource to tell spring to load properties file
    private String customPropertyFromanotherFile;

    @Value("${my.prop}")//when u use this always use @PropertySource to tell spring to load properties file
    private String customPropertyFromanotherFile2;


    @Value("123")
    private Integer customIntPropertyInt;

    @Autowired
    public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass){

        this.myFirstClass= myFirstClass;
    }
    public String tellAStory(){

        return "the dependency is saying: " + myFirstClass.sayHello();
    }

    public String getCustomPropertyFromanotherFile() {
        return customPropertyFromanotherFile;
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public Integer getCustomIntPropertyInt() {
        return customIntPropertyInt;
    }

    public String getCustomPropertyFromanotherFile2() {
        return customPropertyFromanotherFile2;
    }
}
