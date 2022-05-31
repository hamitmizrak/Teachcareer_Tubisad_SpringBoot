package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public  class _9_Java8 {




    public static void main(String[] args) {
      /*  List<String> listem=new ArrayList<>();
        listem.add("servlet");
        listem.add("jsp");
        listem.add("jsp");
        listem.add("jsp");
        listem.add("jsf");
        listem.add("spring framework");
        listem.add("spring data");
        */

        String [] dizi={"jsp","jsp","jsp","jsf","data"};//eleman sayısı bellidir
        List<String> listem= Arrays.asList(dizi); //eleman sayısı belli olmayan

        //stream api
       // listem.forEach(System.out::println);
       // listem.stream().forEach(System.out::println);

        //sorted limit forEach
      /*  listem.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);*/

        //filter
      /*  listem
                .stream()
                .filter( (temp)-> temp.startsWith("j"))
                .collect(Collectors.toList()).forEach(System.out::println);*/

        //map
        listem
                .stream()
                .map( (temp)-> temp.toUpperCase())
                .collect(Collectors.toList()).forEach(System.out::println);

    }

}
