package com.company;

public abstract class Vehiculo {

    private boolean pitar;
    private boolean acelerar;
    private boolean frenar;

    public Vehiculo(boolean pitar, boolean acelerar, boolean frenar) {
        this.pitar = pitar;
        this.acelerar = acelerar;
        this.frenar = frenar;
    }
}


