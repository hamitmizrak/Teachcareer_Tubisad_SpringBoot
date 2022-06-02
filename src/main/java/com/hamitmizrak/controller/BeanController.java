package com.hamitmizrak.controller;

import com.hamitmizrak.bean.StudentBean;
import com.hamitmizrak.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired
    StudentBean studentBean;

    //http://localhost:8080/bean
    @GetMapping("/bean")
    @ResponseBody
    public StudentDto getBean(){
        return studentBean.studentDto();
    }

}
