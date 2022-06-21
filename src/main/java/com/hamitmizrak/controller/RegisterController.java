package com.hamitmizrak.controller;

import com.hamitmizrak.dto.RegisterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Log4j2
public class RegisterController {

    //http://localhost:8080/validation
    @GetMapping("validation")
    public String getRegister(Model model){
        model.addAttribute("validation_key",new RegisterDto());
        return "register";
    }


    //http://localhost:8080/validation
    @PostMapping("validation")
    public String postRegister(@Valid @ModelAttribute("validation_key") RegisterDto registerDto, BindingResult bindingResult){
       if(bindingResult.hasErrors()){
          log.error("Register Ekleme sırasında hata meydana geldi");
           return "register";
       }
       log.info(registerDto);
       //Database
        registerDto=null;
        return "register";
    }


}
