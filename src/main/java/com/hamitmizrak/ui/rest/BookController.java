package com.hamitmizrak.ui.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
public class BookController {
    // http://localhost:8080/book/controller
    @GetMapping("book/controller")
    @ResponseBody
    public String getControllerHeader() {
        String URL = "http://localhost:8080/book/restcontroller";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("key_header","veriler");

        HttpEntity<String> entity=new HttpEntity<String>("other",httpHeaders);
        ResponseEntity<String> response=restTemplate.exchange(URL, HttpMethod.GET,entity,String.class);

        String body=response.getBody();
        return body;
    }
}
