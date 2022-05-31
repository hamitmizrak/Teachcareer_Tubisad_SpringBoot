package com.hamitmizrak.java;

import java.io.Serializable;

public class Home implements IPlace {
    @Override
    public void ide(String ideName) {
        System.out.println("ide: "+ideName);
    }

    @Override
    public void javaSE() {
        System.out.println(" java se öğreniyorum");
    }

    @Override
    public void springData(String data, int number) {
        System.out.println("veri: "+data+" sayı: "+number);
    }

    public static void main(String[] args) {
        Home home=new Home();
        home.ide("intellij idea");
    }
}
