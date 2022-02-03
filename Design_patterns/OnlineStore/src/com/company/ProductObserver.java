package com.company;


import java.util.Observable;
import java.util.Observer;

public class ProductObserver implements Observer {

    @Override
    @SuppressWarnings("unchecked")
    public void update(Observable observable, Object args) {
        if (args instanceof Product.EventPrice) {
            Product.EventPrice event = (Product.EventPrice) args;
            System.out.printf("The produdt %s has changed of price from %s to %s%n", event.getProduct().getName(), event.getOldPrice(), event.getNewPrice());
        }
    }
}