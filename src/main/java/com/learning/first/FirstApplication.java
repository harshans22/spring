package com.learning.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(FirstApplication.class, args);// to get context of IOC container
        //MyFirstClass myfirstclass =new MyFirstClass(); don't need to do this we will use bean
       // MyFirstClass myFirstClass=ctx.getBean(MyFirstClass.class);
        MyFirstService myFirstService=ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
	}

    //one method to declare bean by using component
//    @Bean
//    public MyFirstClass myFirstClass(){
//        return new MyFirstClass();
//    }
}
