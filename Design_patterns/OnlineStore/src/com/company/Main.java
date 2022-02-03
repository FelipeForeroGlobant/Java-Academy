package com.company;

import java.math.BigDecimal;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Cat Food", new BigDecimal("9.99"));
        Product p2 = new Product("Dog Food Premium", new BigDecimal("8.80"));

        Observer o1 = new ProductObserver();
        Product.getObservable().addObserver(o1);

        p1.setPrice(new BigDecimal("7.99"));
        p2.setPrice(new BigDecimal("11.5"));


    }
}
