package com.learning.first;

import org.springframework.stereotype.Component;

//@Component
public class MyFirstClass {
    private String myVar;
    public MyFirstClass(String myVar){
        this.myVar=myVar;
    }
    public String sayHello(){
        return "hello from the first MyFirstClass ==>myVar"+ myVar;
    }
}
