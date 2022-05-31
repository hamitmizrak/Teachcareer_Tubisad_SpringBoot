package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.util.*;

@Log4j2
public class _3_String {
    public static void main(String[] args) {
        //user data
        /*Scanner klavye=new Scanner(System.in);
        int number1=klavye.nextInt();
        int number2= Integer.valueOf(JOptionPane.showInputDialog("Lütfen Bir sayı yazınız")) ;*/

        /*String value=" Servlet JSP JSF ";
        String value2="deneme";

        //String Birleştirme
        String value3=value+value2;
        String value4=value.concat(value2);
        StringBuilder builder=new StringBuilder();
        builder.append(value).append(value2);
        String format=builder.toString();*/

        //String parçalamala
//        String value5="Servlet JSP JSF ";
//        String [] dizi=value5.split(" ");
//
//        //iterative for
//        for (int i = 0; i <dizi.length ; i++) {
//            System.out.println(dizi[i]);
//        }
//
//        System.out.println( "*************************");
//
//        //forEach
//        for(String temp: dizi){
//            System.out.println(temp);
//        }
//
//        //Java 8
//        System.out.println( "*************************");
//      List<String> value6= Arrays.asList(value5);
//        value6.forEach(System.out::println);

        String value5="SpringData SpringMVC java~ jsp&JSF";
        StringTokenizer tokenizer=new StringTokenizer(value5,"~& ");

        while(tokenizer.hasMoreTokens()){
            log.info(tokenizer.nextToken());

        }
        log.error("Hata");


     //System.exit(0);

//        Random random=new Random();
//        int number3=random.nextInt(9)+1;
//        System.out.println(number3);


    }


}
