package com.hamitmizrak.business.services.impl;


import com.hamitmizrak.business.dto.AdminDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //XML Formattar
    //http://localhost:8080/api/v1/rest/object8
    @GetMapping(value = "/rest/object8",produces = MediaType.APPLICATION_XML_VALUE)
    public List<AdminDto> getRest8(){
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



    //RequestParam-1
    //http://localhost:8080/api/v1/rest/object10?id=44&adi=Hamit
    @GetMapping(value = "/rest/object10")
    public AdminDto getRest10(@RequestParam(name="id") Long idim,  @RequestParam(name="adi") String adi){
        AdminDto adminDto=AdminDto
                .builder().id(idim)
                .name(adi)
                .surname("soyadı44")
                .password("Şifre44")
                .build();
        return adminDto;
    }

    //RequestParam
    //http://localhost:8080/api/v1/rest/object11?id=44&adi=Hamit&soyadi=Mızrak
    //http://localhost:8080/api/v1/rest/object11?id=44&adi=Hamit
    @GetMapping(value = "/rest/object11")
    public AdminDto getRest11(
            @RequestParam(name="id") Long idim,
            @RequestParam(name="adi") String adi,
            @RequestParam(name="soyadi",required = false,defaultValue = "soyadı333") String soyadi){
        AdminDto adminDto=AdminDto
                .builder().id(idim)
                .name(adi)
                .surname(soyadi)
                .password("Şifre44")
                .build();
        return adminDto;
    }

    ///////////////////////////////////////////////////
    //ResponseEntity.ok(adminDto): en sık kullanılan
    //http://localhost:8080/api/v1/rest/object12
    @GetMapping("/rest/object12")
    public ResponseEntity<AdminDto>  getRest12(){
        AdminDto adminDto=AdminDto
                .builder()
                .name("adı")
                .surname("soyadı")
                .password("44")
                .build();
        return ResponseEntity.ok(adminDto);
    }


    //http://localhost:8080/api/v1/rest/object13
    @GetMapping("/rest/object13")
    public ResponseEntity<AdminDto>  getRest13(){
        AdminDto adminDto=AdminDto
                .builder()
                .name("adı")
                .surname("soyadı")
                .password("44")
                .build();

       // return new ResponseEntity<>(adminDto, HttpStatus.OK);
       // return  ResponseEntity.status(HttpStatus.OK).body(adminDto);
       // return  ResponseEntity.status(200).body(adminDto);
       // return  ResponseEntity.ok().body(adminDto);
       return ResponseEntity.ok(adminDto);
    }


    //http://localhost:8080/api/v1/rest/object14    ==> not found(404)
    //http://localhost:8080/api/v1/rest/object14/0  ==> bad request(400)
    //http://localhost:8080/api/v1/rest/object14/44
    @GetMapping("/rest/object14/{id}")
    public ResponseEntity<AdminDto> getRest14(@PathVariable (name="id") Long idim){
        AdminDto adminDto=AdminDto
                .builder()
                .id(idim)
                .name("adı")
                .surname("soyadı")
                .password("password")
                .build();

        //id yazılamamışsa
        if(idim==null){
            log.error("404 bulunamadı");
            return ResponseEntity.notFound().build();
        }else if(idim==0){
            log.error("400 bad request");
            return ResponseEntity.badRequest().build();
        }
        log.info(adminDto);
        return ResponseEntity.ok(adminDto);
    }

}
