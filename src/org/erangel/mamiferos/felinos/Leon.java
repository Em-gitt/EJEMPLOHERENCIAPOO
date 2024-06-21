package org.erangel.mamiferos.felinos;

import org.erangel.mamiferos.Mamifero;

public class Leon extends Felinos {
    public int manada;
    public float potenciaRugido;


    public Leon(String habitat, float altura, float peso, String nombreCientifico,
                float tamanoGarras, int velocidad, int manada, float potenciaRugido) {
        super(habitat, altura, peso, nombreCientifico, tamanoGarras, velocidad);
        this.manada = manada;
        this.potenciaRugido = potenciaRugido;
    }


    @Override
    public String comer() {
        return "El leon sale a cazar con su gran manada de "+manada+" leones y con sus grandes garras" +
                "de"+tamanoGarras+" cm";
    }

    @Override
    public String dormir() {
        return "El leon duerme comodamente";
    }

    @Override
    public String correr() {
        return "El gran leon"+nombreCientifico+" lanza u nrugido de "+potenciaRugido+" db para comunicarse";
    }

    @Override
    public String comunicarse() {
        return "";
    }
}
