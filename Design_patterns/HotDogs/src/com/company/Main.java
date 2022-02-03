package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        BaseHotDogFactory hotDogFactory = new HotDogFactory();
        HotDog cheeseHotDog = hotDogFactory.createHotDog("cheese");

        HotDog sauceHotDog = hotDogFactory.createHotDog("sauce");
    }
}
