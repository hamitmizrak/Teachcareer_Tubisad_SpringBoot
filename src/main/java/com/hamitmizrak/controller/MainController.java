package com.hamitmizrak.controller;

import com.hamitmizrak.bean.StudentBean;
import com.hamitmizrak.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    StudentBean studentBean;

    //http://localhost:8080/bean
    @GetMapping("/bean")
    @ResponseBody
    public StudentDto getBean(){
        return studentBean.studentDto();
    }

    /////////////////////////////////
    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")//url
    public String getTymeleaf1(){
        return "thymeleaf_page1"; //html
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")//url
    public String getTymeleaf2(Model model){
        model.addAttribute("key_controller","Ben Javadan geldim");
        return "thymeleaf_page2"; //html
    }


}
