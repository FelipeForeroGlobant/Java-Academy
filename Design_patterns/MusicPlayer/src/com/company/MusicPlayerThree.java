package com.company;

public class MusicPlayerThree extends MusicPlayer {

    String color = "blue";
    String capacity = "16GB";
    String batteryTime = "8H";

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void buyColor() {
        super.buyColor();
    }

    @Override
    public String getCapacity() {
        return capacity;
    }

    @Override
    public void buyCapacity() {
        super.buyCapacity();
    }

    @Override
    public String getBatteryTime() {
        return batteryTime;
    }

    @Override
    public void buyBatteryTime() {
        super.buyBatteryTime();
    }
}
