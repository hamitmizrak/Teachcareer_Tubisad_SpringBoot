package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Random;

@Log4j2
public class _7_try_catch {
    public static void main(String[] args) {
        try{
            int sayi=4/0;
            System.out.println(sayi);
        }catch (Exception exception){
           // exception.printStackTrace();
        }
        System.out.println("ben buradayım");
    }

}
