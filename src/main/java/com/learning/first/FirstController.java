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

    @PostMapping("/post-record")
    public String postRecord( @RequestBody OrderRecord order){
        return "Post request with message: " + order.toString();
    }

    //passing as a path variable
   //https://localhost:8080/hello/var
    @GetMapping("/hello/{userName}")//setting path variable
    public String pathvar( @PathVariable String userName){
        return "my value ="+ userName;
    }


//passing as a parameter
    //https://localhost:8080/hello?param_name=paramValue && param_name2=paramValue2
    @GetMapping("/hello")//setting path variable
    public String param( @RequestParam("user-name") String userName,
                         @RequestParam("user-lastname") String lastname){
        return "my value ="+ userName + " " + lastname;
    }

}
