package com.company;

import java.math.BigDecimal;
import java.util.Observable;

public class Product {

    public class EventPrice {

        private Product product;
        private BigDecimal oldPrice;
        private BigDecimal newPrice;

        public EventPrice(Product product,  BigDecimal oldPrice, BigDecimal newPrice) {
            this.product = product;
            this.oldPrice = oldPrice;
            this.newPrice = newPrice;
        }

        public Product getProduct() {
            return product;
        }

        public BigDecimal getOldPrice() {
            return oldPrice;
        }

        public BigDecimal getNewPrice() {
            return newPrice;
        }
    }

    private static final ProductObservable OBSERVABLE;

    private String name;
    private BigDecimal price;

    static {
        OBSERVABLE = new ProductObservable();
    }

    public static Observable getObservable() {
        return OBSERVABLE;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        EventPrice event = new EventPrice(this, this.price, price);

        this.price = price;

        synchronized (OBSERVABLE) {
            OBSERVABLE.setChanged();
            OBSERVABLE.notifyObservers(event);
        }
    }

    private static class ProductObservable extends Observable {
        @Override
        public synchronized void setChanged() {
            super.setChanged();
        }
    }
}
