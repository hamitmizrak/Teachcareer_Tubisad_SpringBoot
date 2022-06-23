package com.hamitmizrak.ui.mvc;

import com.hamitmizrak.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //http://localhost:8080
    @GetMapping("index")
    public String getIndex() {
        return "index";
    }
}
