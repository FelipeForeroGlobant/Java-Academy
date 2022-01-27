package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ej2 {


    public static void main(String[] args) {

        System.out.println("Input the name that you want find in memory Cache: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        HashMap<String, String> memoryCache = new HashMap<String, String>();

        memoryCache.put("John", "12345");
        memoryCache.put("Steve", "114567");
        memoryCache.put("Angie", "45615");

        for (String i : memoryCache.keySet()) {
            System.out.println("Name: " + i + " Id: " + memoryCache.get(i));
        }

            ArrayList<String> dataBase = new ArrayList<String>();
            dataBase.add("Felipe, 1012556962");
            dataBase.add("Jorge, 101547852");
            dataBase.add("Camila, 23497851");
            dataBase.add("Lorena, 425145");
            //System.out.println(dataBase);

            for (String s : dataBase) {
                    //System.out.println(s);

            }



    }
}
