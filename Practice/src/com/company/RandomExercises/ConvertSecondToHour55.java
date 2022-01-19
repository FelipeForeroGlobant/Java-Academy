package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConvertSecondToHour55 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the digits in seconds: ");
        int seconds = sc.nextInt();

        int hours = seconds / 60;
        int minutes = hours % 60;
        int finallySeconds = seconds % 60;

        hours = hours / 60;
        System.out.print( hours + ":" + minutes + ":" + finallySeconds);
    }
}
