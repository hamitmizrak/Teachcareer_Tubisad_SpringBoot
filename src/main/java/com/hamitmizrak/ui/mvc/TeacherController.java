package com.hamitmizrak.ui.mvc;

import com.hamitmizrak.data.entity.TeacherEntity;
import com.hamitmizrak.data.repository.ITeacherRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Log4j2
public class TeacherController {

    @Autowired
    ITeacherRepository repository;

    //http://localhost:8080/teacher/save
    @GetMapping("/teacher/save")
    @ResponseBody
    public String saveTeacher(){
        for (int i = 0; i <10 ; i++) {
            repository.save(TeacherEntity.builder().teacherName("adi "+i).teacherSurname("soyadi "+i).build());
        }
        return "Kaydedildi";
    }

    //http://localhost:8080/teacher/find/soyadı
    //http://localhost:8080/teacher/find/soyad%C4%B1%200
    @GetMapping("/teacher/find/{username}")
    @ResponseBody
    public List<TeacherEntity> findTeacherUserSurname( @PathVariable(name = "username") String teacherSurname){
        List<TeacherEntity> teacherEntities=  repository.findTeacherEntitiesByTeacherSurname(teacherSurname);
        return teacherEntities;
    }

}
