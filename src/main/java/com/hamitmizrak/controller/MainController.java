package com.hamitmizrak.controller;

import com.hamitmizrak.bean.StudentBean;
import com.hamitmizrak.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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
        return "thymeleaf1"; //html
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")//url
    public String getTymeleaf2(Model model){
        model.addAttribute("key_controller","Ben Javadan geldim");
        return "thymeleaf2"; //html
    }

    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")//url
    public String getTymeleaf3(Model model){
        StudentDto studentDto=new StudentDto();
        studentDto.setStudentId(1L);
        studentDto.setStudentName("Zahid");
        studentDto.setStudentSurname("soyadı");
        model.addAttribute("key_controller",studentDto);
        return "thymeleaf3"; //html
    }


    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")//url
    public String getTymeleaf4(Model model){
        List<StudentDto> listem=new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            listem.add(StudentDto.builder().studentId(i).studentName("Adı "+i).studentSurname("Soyadı "+i).build());
        }
        model.addAttribute("key_controller",listem);
        return "thymeleaf4"; //html
    }


    ///////////////////////////////////
    //PathVariable
    //http://localhost:8080/thymeleaf5
    //http://localhost:8080/thymeleaf5/4
    @GetMapping({"/thymeleaf5","/thymeleaf5/{id}"})
    public String getTymeleaf5(Model model, @PathVariable(name="id",required = false) Long id){
        if(id!=null){
            model.addAttribute("key_controller",id+" numaralı id bulundu");
        }else{
            model.addAttribute("key_controller"," bulunamadı");
        }
        return "thymeleaf5"; //html
    }

    //pathVariable id'li
    // http://localhost:8080/templates/thymeleaf6/44
    @GetMapping("templates/thymeleaf6/{id}")
    public String getPathVariable(Model model, @PathVariable(name = "id") int id) {
        model.addAttribute("key", "id: " + id);
        return "thymeleaf9";
    }

    //pathVariable id'li id'siz
    // http://localhost:8080/templates/thymeleaf7/
    // http://localhost:8080/templates/thymeleaf7/11
    @GetMapping({"templates/thymeleaf7/", "templates/thymeleaf7/{id}"})
    public String getPathVariableNonRequired(Model model, @PathVariable(name = "id", required = false) Long id) {
        if (id != null) {
            model.addAttribute("key", "id: " + id);
        } else {
            model.addAttribute("key", "aradığınız ürün bulunamadı: ");
        }
        return "thymeleaf9";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //RequestParam (1 attributes)
    // http://localhost:8080/templates/thymeleaf8?adi=Hamit
    @GetMapping("templates/thymeleaf8")
    public String getRequestParamOne(Model model, @RequestParam(name = "adi") String name) {
        model.addAttribute("key", "RequestParam: " + name);
        return "thymeleaf9";
    }


    //RequestParam (2 attributes)
    // http://localhost:8080/templates/thymeleaf9?name=Hamit&surname=Mizrak
    @GetMapping("templates/thymeleaf9")
    public String getRequestParamTwo(
            Model model,
            @RequestParam(name="name") String name,
            @RequestParam(name="surname") String surname
    ){
        model.addAttribute("key","adı: "+name+" soyadı: "+surname);
        return "thymeleaf9";
    }

    //RequestParam /required=false)
    // http://localhost:8080/templates/thymeleaf10
    // http://localhost:8080/templates/thymeleaf10?adi=Hamit
    @GetMapping("templates/thymeleaf10")
    public String getRequestParamRequired(
            Model model,
            @RequestParam(name="adi",required = false,defaultValue="adı girilmedi") String value){
        model.addAttribute("key","adı: "+value);
        return "thymeleaf9";
    }

}
