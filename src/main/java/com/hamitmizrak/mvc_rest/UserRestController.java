package com.hamitmizrak.mvc_rest;

import com.hamitmizrak.business.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {

    // http://localhost:8080/user/get/Hamit
    @GetMapping("/get/{name}")
    public UserDto getUser(@PathVariable(name="name") String adi){
        UserDto userDto=UserDto.builder().userId(44L).userName(adi).userSurname("Mızrak").build();
        return userDto;
    }
}
