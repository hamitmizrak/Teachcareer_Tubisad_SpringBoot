package com.hamitmizrak.mvc_rest;

import com.hamitmizrak.business.dto.UserDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {

    // http://localhost:8080/user/get/controller
    @GetMapping("user/get/controller")
    public String getUserController(Model model) {

        //api url
        String URL = "http://localhost:8080/user/get/Hamit";
        RestTemplate restTemplate = new RestTemplate();

        //ResponseEntity ==> Kullanmadan
        //UserDto userDto=  restTemplate.getForObject(URL, UserDto.class);

        //ResponseEntity ==> Kullanarak
        ResponseEntity<UserDto> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, HttpEntity.EMPTY, UserDto.class);
        UserDto userDto = responseEntity.getBody();

        model.addAttribute("user_mvc_rest_key", userDto);
        return "user_mvc_rest";
    }
}
