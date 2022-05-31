package com.hamitmizrak.java;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

abstract public class Computer {
    private String computerName;
    private String computerTrade;
    private double computerPrice;

    public void govdeliMethod() {
        System.out.println("Merhabalar ");
    }

    abstract public void govdesizMethod();


}