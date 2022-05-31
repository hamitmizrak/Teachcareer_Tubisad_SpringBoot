package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

@Log4j2
public final class _8_Method { //extends yapamayız

    public final static void deneme(String val){ //override yapamam.
        System.out.println("deneme"+val);
    }

    public static void main(String[] args) {

        final Long VAL_CAST=15546L;

        /*_8_Method method=new _8_Method();
        method.deneme();*/
        deneme("Java");
    }

}
