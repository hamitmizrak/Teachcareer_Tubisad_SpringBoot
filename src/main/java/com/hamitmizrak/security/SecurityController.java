package com.hamitmizrak.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    //http://localhost:8080/security/public
    @GetMapping("security/public")
    public String publicData(){
        return "index";
    }


    //http://localhost:8080/security/secret
    @GetMapping("security/secret")
    public String secretData(){
        return "secret";
    }
}
