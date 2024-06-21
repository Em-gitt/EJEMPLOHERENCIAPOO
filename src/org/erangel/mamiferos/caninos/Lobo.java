package org.erangel.mamiferos.caninos;

public class Lobo extends Caninos{
    public int numeroCamada;
    public String especieLobo;

    public Lobo(String habitat, float altura, float peso, String nombreCientifico,
                String color, float tamanoColmillos, int numeroCamada, String especieLobo) {
        super(habitat, altura, peso, nombreCientifico, color, tamanoColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo "+nombreCientifico+" come con "+numeroCamada;
    }

    @Override
    public String dormir() {
        return "El lobo duerme felizmente en "+habitat;
    }

    @Override
    public String correr() {
        return "El lobo corre junto a su"+numeroCamada;
    }

    @Override
    public String comunicarse() {
        return "El lobo se comunica con "+numeroCamada+" lobos";
    }
}
