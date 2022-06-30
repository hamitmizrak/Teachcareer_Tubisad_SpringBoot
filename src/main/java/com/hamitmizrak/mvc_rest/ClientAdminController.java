package com.hamitmizrak.mvc_rest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

//Client
@Controller
public class ClientAdminController {

    //http://localhost:8080/client/admin
    @GetMapping("/client/admin")
    @ResponseBody
    public String clientController() {
        String URL="http://localhost:8080/admin/v1/server/rest_controller";

        //serverdaki veriyi almak için kullanılır.
        RestTemplate restTemplate=new RestTemplate();
        String jsonData=restTemplate.getForObject(URL,String.class);
        return jsonData;
    }
}
