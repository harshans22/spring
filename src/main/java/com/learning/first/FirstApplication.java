package com.learning.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Collections;

import static java.util.Collection.*;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
        var app=new SpringApplication(FirstApplication.class);
        app.setDefaultProperties(
            Collections.singletonMap("spring.profiles.active","dev")// manually setting the profile
        );
		var ctx=app.run(args);// to get context of IOC container
        MyFirstService myFirstService=ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
        System.out.println(myFirstService.getCustomProperty());
	}
}
