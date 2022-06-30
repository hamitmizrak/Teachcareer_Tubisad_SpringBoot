package com.hamitmizrak.business.services.impl;


import com.hamitmizrak.business.dto.AdminDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Log4j2
public class AdminServices {

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
        AdminDto adminDto=AdminDto
                .builder()
                .name("adı")
                .surname("soyadı")
                .password("44")
                .build();
        return adminDto;
    }


    //http://localhost:8080/api/v1/rest/object3
    @GetMapping(value = "/rest/object3",produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminDto getRest3(){
        AdminDto adminDto=AdminDto
                .builder()
                .name("adı")
                .surname("soyadı")
                .password("44")
                .build();
        return adminDto;
    }


    //http://localhost:8080/api/v1/rest/object4
    @GetMapping(value = "/rest/object4",produces ="application/json")
    public AdminDto getRest4(){
        AdminDto adminDto=AdminDto
                .builder()
                .name("adı")
                .surname("soyadı")
                .password("44")
                .build();
        return adminDto;
    }

    //http://localhost:8080/api/v1/rest/object5/44
    //Path Variable
    @GetMapping(value = "/rest/object5/{id}")
    public AdminDto getRest5(@PathVariable(name="id") Long idim){
        AdminDto adminDto=AdminDto
                .builder().id(idim)
                .name("adı44")
                .surname("soyadı44")
                .password("Şifre44")
                .build();
        return adminDto;
    }


    //http://localhost:8080/api/v1/rest/object6
    //http://localhost:8080/api/v1/rest/object6/55
    //Path Variable
    @GetMapping(value = {"/rest/object6","/rest/object6/{id}"})
    public AdminDto getRest6(@PathVariable(name="id",required = false) Long idim){
        AdminDto adminDto = null;
        if(idim==null){
           log.error("id girilmedi");
        }else{
            adminDto =AdminDto
                    .builder()
                    .id(idim)
                    .name("adı44")
                    .surname("soyadı44")
                    .password("Şifre44")
                    .build();
        }
        return adminDto;
    }

    //List
    //http://localhost:8080/api/v1/rest/object7
    @GetMapping(value = "/rest/object7")
    public List<AdminDto> getRest7(){
        List<AdminDto> listem=new ArrayList<>();
        for (long i = 1; i <=3 ; i++) {
            listem.add( AdminDto.builder()
                     .id(i)
                    .name("adı "+i)
                    .surname("soyadı "+i)
                    .password("Şifre "+i)
                    .build()
                    );
        }
        //console output List Data
        listem.forEach(System.out::println);
        return listem;
    }


}
