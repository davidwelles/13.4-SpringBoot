package com.tts.week134.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//basically allowing restful endpoints
@RestController
public class MainController {
    //this is an endpoint
    //we can access this resource
    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }


    //going to an endpoint in browser will resolve method
    @GetMapping("/math")
    public Integer doMath(){
        return 5 +4;
    }

    //this allows to declare values and still print to console you must declare the variables in the browser. an example: localhost:8080/parammath/3/5
    @GetMapping("/parammath/{x}/{y}")
    public Integer doMathwithParams(@PathVariable int x, @PathVariable int y){
        return x + y;
    }
    //additional example of browser variables
    @GetMapping("/hello/{name}")
    public String homeWithName(@PathVariable String name) {
        return "Hello " + name;
    }

    // this method will print to terminal not to browser due to void
    public void doPrint(){

        System.out.println("hello from the terminal");
    }
}
