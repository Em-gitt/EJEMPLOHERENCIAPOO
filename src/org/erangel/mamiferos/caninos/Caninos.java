package org.erangel.mamiferos.caninos;

import org.erangel.mamiferos.Mamifero;

abstract public class Caninos extends Mamifero {
    protected String color;
    protected float tamanoColmillos;
    public Caninos(String habitat, float altura, float peso, String nombreCientifico) {
        super(habitat, altura, peso, nombreCientifico);
    }

    public Caninos(String habitat, float altura, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }



    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
