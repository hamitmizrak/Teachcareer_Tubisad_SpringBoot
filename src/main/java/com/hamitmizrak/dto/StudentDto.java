package com.hamitmizrak.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Log4j2

public class StudentDto {
    private long studentId;
    private String studentName;
    private String studentSurname;

    //life cycle
    public void initialBean(){
        log.info("Bean Doğdu");
        System.out.println("Bean Doğdu");
    }

    public void destroyBean(){
        log.info("Bean Öldü");
        System.out.println("Bean Öldü");
    }
}
