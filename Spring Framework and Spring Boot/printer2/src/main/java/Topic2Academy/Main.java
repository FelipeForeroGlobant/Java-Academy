package com.company;

import Topic2Academy.BlackWhitePrinter;
import Topic2Academy.FullColorPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // write your code here

        BlackWhitePrinter blackWhitePrinter = new BlackWhitePrinter();
        blackWhitePrinter.print();

        FullColorPrinter fullColorPrinter = new FullColorPrinter();
        fullColorPrinter.print();

    }
}
