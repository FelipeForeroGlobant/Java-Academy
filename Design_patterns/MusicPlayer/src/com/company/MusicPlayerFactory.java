package com.company;

public class MusicPlayerFactory {

    private static MusicPlayerFactory instance;

    private MusicPlayerFactory()
    {

    }

    public static MusicPlayerFactory getInstance()
    {
        if (instance == null)
            instance = new MusicPlayerFactory();

        return instance;

    }


    public static MusicPlayer built(String typeColor,String typeCapacity, String typeBatteryTime)
    {

        if(typeColor.equals("blue") && typeCapacity.equals("8GB" )&& typeBatteryTime.equals("5H")){
            return new MusicPlayerOne();
        }
        if(typeColor.equals("blue") && typeCapacity.equals("16GB" )&& typeBatteryTime.equals("5H")){
            return new MusicPlayerTwo();
        }
        if(typeColor.equals("blue") && typeCapacity.equals("16GB" )&& typeBatteryTime.equals("8H")){
            return new MusicPlayerThree();
        }
        if(typeColor.equals("blue") && typeCapacity.equals("8GB" )&& typeBatteryTime.equals("8H")){
            return new MusicPlayerFour();
        }

        if(typeColor.equals("green") && typeCapacity.equals("8GB" )&& typeBatteryTime.equals("5H")) {
            return new MusicPlayerFive();
        }

        if(typeColor.equals("green") && typeCapacity.equals("16GB" )&& typeBatteryTime.equals("5H")){
            return new MusicPlayerSix();
        }

        if(typeColor.equals("green") && typeCapacity.equals("16GB" )&& typeBatteryTime.equals("8H")){
            return new MusicPlayerSeven();
        }

        if(typeColor.equals("green") && typeCapacity.equals("8GB" )&& typeBatteryTime.equals("8H")){
            return new MusicPlayerEight();
        }

        else{
            System.out.println("Please input only the options");
            return null;
        }


    }


}
