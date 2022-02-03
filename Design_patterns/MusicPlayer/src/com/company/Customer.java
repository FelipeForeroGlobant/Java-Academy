package com.company;

public class Customer {

    public static void main(String[] args) {
	// write your code here

        MusicPlayer musicPlayer = MusicPlayerFactory.built("blue","8GB","5H");
        musicPlayer.buyColor();
        musicPlayer.buyCapacity();
        musicPlayer.buyBatteryTime();

        MusicPlayer musicPlayer1 = MusicPlayerFactory.built("green","16GB","8H");
        musicPlayer1.buyColor();
        musicPlayer1.buyCapacity();
        musicPlayer1.buyBatteryTime();

    }
}
