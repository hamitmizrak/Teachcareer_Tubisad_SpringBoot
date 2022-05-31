package com.hamitmizrak.java;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class _10_Class {
    private String name;
    private String surname;

    public static void main(String[] args) {
        _10_Class deneme=_10_Class.builder().name("Hamit").surname("Mızrak").build();
        System.out.println(deneme);
    }
}
