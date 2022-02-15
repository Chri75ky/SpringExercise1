package com.example.firstexercise.controllers;

import com.example.firstexercise.services.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/endpoint")
    public String endpoint(){
        return "Hello and welcome to my lovely site, made just for the perfect person that is myself :)";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input){
        return input;

    }
    @GetMapping("/isItFriday")
    public String isItFriday(){
        Calculator cal = new Calculator();
        if(cal.isItFriday()){
            return "YAY IT'S FRIDAY";
        } else return "Nah too bad bruh";
    }

}
