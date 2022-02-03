package com.company;

public class HotDogFactory extends BaseHotDogFactory{
    @Override
    public  HotDog createHotDog(String type){
        HotDog hotDog;
        switch (type.toLowerCase())
        {
            case "cheese":
                hotDog = new CheeseHotDog();
                break;
            case "pepperoni":
                hotDog = new PepperoniHotDog();
                break;
            case "veggie":
                hotDog = new VeggieHotDog();
                break;
            case "sauce":
                hotDog = new SauceHotDog();
                break;
            default: throw new IllegalArgumentException("No such hot dog.");
        }

        hotDog.addIngredients();
        hotDog.cookHotDog();
        return hotDog;
    }
}