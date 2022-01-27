package com.company;

public class Bus extends Vehiculo{

    private boolean dobleTraccion;

    public Bus(boolean pitar, boolean acelerar, boolean frenar, boolean dobleTraccion) {
        super(pitar, acelerar, frenar);
        this.dobleTraccion = dobleTraccion;
    }
}
