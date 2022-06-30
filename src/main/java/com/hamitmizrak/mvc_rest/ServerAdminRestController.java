package com.hamitmizrak.mvc_rest;

import com.hamitmizrak.business.dto.AdminDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Server
@RestController
@RequestMapping("/admin/v1")
@Log4j2
public class ServerAdminRestController {

    // #### Spring MVC - Spring REST
    //http://localhost:8080/admin/v1/server/rest_controller
    //@RestController = Server(hizmet veriyor)
    @GetMapping("/server/rest_controller")
    public AdminDto serverRestController(){
        AdminDto adminDto=AdminDto
                .builder()
                .id(11L)
                .name("adı")
                .surname("soyadı")
                .password("44")
                .build();
        return adminDto;
    }
}
