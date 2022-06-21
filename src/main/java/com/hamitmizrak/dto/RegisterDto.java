package com.hamitmizrak.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RegisterDto {

    private Long registerId;

    @NotEmpty(message = "adı boş geçilemez")
    private String registerName;

    @NotEmpty(message = "soyadı geçilemez")
    private String registerSurname;

    @NotEmpty(message = "email boş geçilemez")
    @Email(message = "uygun formatta email girmediniz examples: deneme@com")
    private String registerEmail;

    public String getNowDate(){
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }

    private String creationDate=getNowDate();
}
