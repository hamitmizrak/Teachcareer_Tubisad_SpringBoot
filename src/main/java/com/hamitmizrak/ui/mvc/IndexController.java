package com.hamitmizrak.ui.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //http://localhost:8080
    @GetMapping("index")
    public String getIndex() {
        return "index";
    }
}
