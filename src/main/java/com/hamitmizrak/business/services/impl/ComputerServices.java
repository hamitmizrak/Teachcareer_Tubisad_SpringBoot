package com.hamitmizrak.business.services.impl;


import com.hamitmizrak.business.dto.AdminDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ComputerServices {

    //http://localhost:8080/api/v1/rest/manuelJson
    @GetMapping("/rest/manuelJson")
    public String getRest1(){
        return "{\n" +
                "  \"adı\":\"Hamit\",\n" +
                "  \"soyadı\":\"Mızrak\"\n" +
                "}";
    }


    //http://localhost:8080/api/v1/rest/object
    @GetMapping("/rest/object")
    public AdminDto getRest2(){
        AdminDto adminDto=AdminDto.builder().name("adı").surname("soyadı").password("44").build();
        return adminDto;
    }


    //http://localhost:8080/api/v1/rest/object3
    @GetMapping(value = "/rest/object3",produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminDto getRest3(){
        AdminDto adminDto=AdminDto.builder().name("adı3").surname("soyadı3").password("33").build();
        return adminDto;
    }


    //http://localhost:8080/api/v1/rest/object4
    @GetMapping(value = "/rest/object4",produces ="application/json")
    public AdminDto getRest4(){
        AdminDto adminDto=AdminDto.builder().name("adı4").surname("soyadı4").password("44").build();
        return adminDto;
    }


}
