package com.company;

public class Vabriolet extends Vehiculo{
    private boolean removerTecho;
    private boolean ponerTecho;


    public Vabriolet(boolean pitar, boolean acelerar, boolean frenar, boolean removerTecho, boolean ponerTecho) {
        super(pitar, acelerar, frenar);
        this.removerTecho = removerTecho;
        this.ponerTecho = ponerTecho;
    }
}
