package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

@Log4j2
public class _6_If_Ternary_For {
    public static void main(String[] args) {

        //Kullanıcıdan aldığımız kelime 5 harften büyükse büyük
       // String value = JOptionPane.showInputDialog("Lütfen Bir kelime giriniz");
      /*  if(value.length()>=5){
            log.info("Büyüktür");
        }else{
            log.info("Küçüktür");
        }*/

        /*if(value.length()>=5)
            log.info("Büyüktür");
        else
            log.info("Küçüktür");*/
        /*String result= (value.length()>=5) ? "Büyüktür" : "Küçüktür";
        System.out.println(result);*/
        /*System.out.println((value.length()>=5) ?"Büyüktür" : "Küçüktür");*/

        // Haftanın günleri
      /*  String day = "sali";
        switch (day) {
            case "pazartesi":
                System.out.println("pazartesi");
                break;

            case "sali":
                System.out.println("sali");
                break;

            case "carsamba":
                System.out.println("carsamba");
                break;

            case "persembe":
                System.out.println("persembe");
                break;

            case "cuma":
                System.out.println("cuma");
                break;

            case "cumartesi":
                System.out.println("cumartesi");
                break;

            case "pazar":
                System.out.println("pazar");
                break;

            default :
                System.out.println("other day");
                break;
        }
*/

        //rastgele 5 tane sayıyı dizide toplamları
        int [] dizi=new int[5];
        for (int i = 0; i <dizi.length ; i++) {
            Random random=new Random();
            int number= random.nextInt(5)+1;
             dizi[i]=number;
        }
        Arrays.sort(dizi);
        for(int temp:dizi){
            System.out.print( temp+" ");
        }
        System.out.println("\n"+dizi[0]);
        System.out.println(dizi[dizi.length-1]);

    }

}
