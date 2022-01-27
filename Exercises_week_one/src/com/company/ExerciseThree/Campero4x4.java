package com.company;

public class Campero4x4 extends Vehiculo {
    private boolean dobleTraccion;

    public Campero4x4(boolean pitar, boolean acelerar, boolean frenar, boolean dobleTraccion) {
        super(pitar, acelerar, frenar);
        this.dobleTraccion = dobleTraccion;
    }
}
