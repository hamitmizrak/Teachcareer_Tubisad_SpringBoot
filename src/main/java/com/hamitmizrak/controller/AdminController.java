package com.hamitmizrak.controller;

import com.hamitmizrak.dto.AdminDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2
public class AdminController {

    //http://localhost:8080/form
    @GetMapping("form")
    public String getAdmin(Model model){
        model.addAttribute("form_key",new AdminDto());
        return "form";
    }

    //http://localhost:8080/form
    @PostMapping("form")
    public String postAdmin(Model model,AdminDto adminDto){
        log.info(adminDto);
        model.addAttribute("form_key",adminDto);
        return "form";
    }
}
