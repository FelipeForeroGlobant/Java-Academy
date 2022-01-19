package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class SpecificDate47 {

    public static void main(String[] args) {

        //47. Write a Java program to display the current date time in specific format.

        DateTimeFormatter dayTimeDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SS");
        System.out.println(dayTimeDate .format(LocalDateTime.now()));



    }
}
