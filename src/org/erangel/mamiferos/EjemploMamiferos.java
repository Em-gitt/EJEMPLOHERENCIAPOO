package org.erangel.mamiferos;

import org.erangel.mamiferos.caninos.*;
import org.erangel.mamiferos.felinos.*;

import java.util.ArrayList;

public class EjemploMamiferos {
    public static void main(String[] args) {
        ArrayList<Mamifero> Mamiferos = new ArrayList();

        Mamifero loboGris = new Lobo("Montanas", 2.2f, 35.9f, "Canis lupus baileyi",
                "Gris", 4.2f, 29, "Lobo gris mexicano");
        Mamiferos.add(loboGris);

        Mamifero goldenRetriever = new Perro("Hogar", 1.2f, 25.9f,
                "Canis lupus familiaris","Dorado", 1.4f, 2);
        Mamiferos.add(goldenRetriever);

        Mamifero guepardo = new Guepardo("Suroeste de Asia", 5.2f, 65.1f,
                "Acinonyx jubatus",10.2f, 70);
        Mamiferos.add(guepardo);

        Mamifero leonAfricano = new Leon("Selva Africana", 3.2f, 80.9f,
                "Panthera leo",5.2f, 50, 55, 200);
        Mamiferos.add(leonAfricano);

        Tigre tigreBengala = new Tigre("India", 4.7f, 80.2f,
                "Panthera tigris tigris","Tigre de bengala");
        Mamiferos.add(tigreBengala);

        Mamiferos.forEach(System.out::println);

        Mamiferos.forEach(mamifero -> {
            if (mamifero instanceof Felinos felino) {
                System.out.println(felino.comer());
                System.out.println(felino.dormir());;
                System.out.println();
            }
            if (mamifero instanceof Caninos canino) {
                System.out.println(canino.correr());
                System.out.println(canino.comunicarse());
                System.out.println();
            }
        });

    }
}
