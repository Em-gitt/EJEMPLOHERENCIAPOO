package org.erangel.mamiferos.caninos;

import org.erangel.mamiferos.Mamifero;

public class Perro extends Caninos {
    public int fuerzaMordida;

    public Perro(String habitat, float altura, float peso, String nombreCientifico,
                 String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro comiendo con fuerza " + fuerzaMordida;
    }

    @Override
    public String dormir() {
        return "El perro duerme tranquilamente en su "+habitat;
    }

    @Override
    public String correr() {
        return "El perro correctea felizmente en "+habitat;
    }

    @Override
    public String comunicarse() {
        return "El gran perro "+nombreCientifico+" de: "+altura+" metros busca con quien hablar";
    }
}
