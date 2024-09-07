package com.learning.first;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Om Ganeshaya Namaha";
    }

   @PostMapping("/post")
    public String post( @RequestBody String message){
        return "Post request with message: " + message;
   }

    @PostMapping("/post-order")
    public String post( @RequestBody Order order){
        return "Post request with message: " + order.toString();
    }
}
