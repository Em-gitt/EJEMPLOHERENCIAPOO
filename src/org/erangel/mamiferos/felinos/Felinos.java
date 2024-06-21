package org.erangel.mamiferos.felinos;

import org.erangel.mamiferos.Mamifero;

abstract public class Felinos extends Mamifero {
    protected float tamanoGarras;
    protected int velocidad;

    public Felinos(String habitat, float altura, float peso, String nombreCientifico) {
        super(habitat, altura, peso, nombreCientifico);
    }

    public Felinos(String habitat, float altura, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
