package org.erangel.mamiferos.felinos;

public class Guepardo extends Felinos{
    public Guepardo(String habitat, float altura, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo come a sus presas en "+habitat;
    }

    @Override
    public String dormir() {
        return "El duerme comodamente en "+habitat;
    }

    @Override
    public String correr() {
        return "El leon corre libremente en "+habitat;
    }

    @Override
    public String comunicarse() {
        return "El leon habla con otros leones "+nombreCientifico;
    }
}
