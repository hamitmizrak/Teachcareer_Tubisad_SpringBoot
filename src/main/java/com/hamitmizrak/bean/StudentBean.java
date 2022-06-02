package com.hamitmizrak.bean;

import com.hamitmizrak.dto.StudentDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentBean {

    @Bean
    public StudentDto studentDto() {
        return StudentDto.builder()
                .studentId(1L)
                .studentName("isim")
                .studentSurname("soyisim")
                .build();
    }
}
