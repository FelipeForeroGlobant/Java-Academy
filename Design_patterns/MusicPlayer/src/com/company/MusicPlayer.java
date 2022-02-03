package com.company;

public abstract class MusicPlayer {
    private String color;
    private String capacity;
    private String batteryTime;

    public String getColor() {
        return color;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getBatteryTime() {
        return batteryTime;
    }

    public void buyColor(){
        System.out.println("Buy a music player color: " + getColor());
    }

    public void buyCapacity(){
        System.out.println("Buy a music player with capacity: " + getCapacity());
    }

    public void buyBatteryTime() { System.out.println("Buy a music player with battery time than: " + getBatteryTime());}
}
