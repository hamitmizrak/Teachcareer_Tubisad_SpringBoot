package com.hamitmizrak.ui.rest;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cors")
@CrossOrigin
public class CorsRestController {

    //http://localhost:8080/cors/get/message
    @GetMapping("/get/message")
    public String getMessage(){
        return "Ben Java Diyardında geldim";
    }

}
