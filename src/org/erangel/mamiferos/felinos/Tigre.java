package org.erangel.mamiferos.felinos;

import org.erangel.mamiferos.Mamifero;

public class Tigre extends Felinos {
    public String especie;

    public Tigre(String habitat, float altura, float peso, String nombreCientifico, String especie) {
        super(habitat, altura, peso, nombreCientifico);
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "El tigre "+especie+ " come en "+habitat;
    }

    @Override
    public String dormir() {
        return "El tigre "+especie+" duerme comodamente";
    }

    @Override
    public String correr() {
        return "El tigre corre amargamente ya que nadie se iguala a su tamanio de "+altura+" metros";
    }

    @Override
    public String comunicarse() {
        return "El tigre se comunica con otros tigres";
    }
}
