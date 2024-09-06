package com.learning.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(FirstApplication.class, args);// to get context of IOC container
        MyFirstService myFirstService=ctx.getBean(MyFirstService.class);
        System.out.println(myFirstService.tellAStory());
        System.out.println(myFirstService.getCustomProperty());
	}
}
