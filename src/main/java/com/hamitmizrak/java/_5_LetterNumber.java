package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

@Log4j2
public class _5_LetterNumber {
    public static void main(String[] args) {

        char c1='@';
        if(Character.isDigit(c1))
            System.out.println("sayıdır");
        else if(Character.isLetter(c1))
            System.out.println("Harftir");
        else
            System.out.println("Özel simgedir");

    }

}
