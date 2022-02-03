package com.company;

public abstract class BaseHotDogFactory {
    public HotDog getHotDog(String type){
        HotDog myHotDog = this.createHotDog(type);
        myHotDog.addIngredients();
        myHotDog.cookHotDog();
        return myHotDog;
    }
    public abstract HotDog createHotDog(String type);
}