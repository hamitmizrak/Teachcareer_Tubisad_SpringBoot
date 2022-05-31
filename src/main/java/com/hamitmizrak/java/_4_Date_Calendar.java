package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

@Log4j2
public class _4_Date_Calendar {
    public static void main(String[] args) {
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd MMMM yyyy HH:mm:ss",locale);

        //Date
        java.util.Date date=new Date();
        String value=simpleDateFormat.format(date);
        System.out.println(value);

        //Calendar
        Calendar date2=Calendar.getInstance();
        String value2=simpleDateFormat.format(date2.getTime());
        System.out.println(value2);

    }

}
