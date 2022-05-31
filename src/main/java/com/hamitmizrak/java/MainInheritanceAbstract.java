package com.hamitmizrak.java;

public class MainInheritanceAbstract {

    public static void main(String[] args) {

        Computer computer= new Msi(); //polymorphism
        computer.setComputerName("msi45");
        computer.setComputerTrade("trade56");
        computer.setComputerPrice(56);

        System.out.println(computer);

        System.out.println("****************");

        Msi msi=new Msi();
        msi.setComputerName("msi gl78");
        msi.setComputerTrade("msi");
        msi.setComputerPrice(15);
        msi.govdeliMethod(); //polymorphism
        msi.govdesizMethod();
        System.out.println(msi);

        System.out.println("****************");

        Asus asus=new Asus();
        asus.setComputerName("asus xl88");
        asus.setComputerTrade("asus");
        asus.setComputerPrice(25);
        asus.govdeliMethod(); //polymorphism
        asus.govdesizMethod();
        System.out.println(asus);

    }
}
