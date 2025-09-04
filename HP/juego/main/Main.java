package juego.main;

import juego.hechizos.*;
import juego.personajes.Personaje;

public class Main {
    public static void main(String[] args) {
        // Inicialización de personajes con su hechizo principal
        Personaje harry = new Personaje("Harry Potter", new ExpectoPatronum());
        Personaje ron = new Personaje("Ron Weasley", new Expelliarmus());
        Personaje hermione = new Personaje("Hermione Granger", new WingardiumLeviosa());

        // Harry
        harry.lanzarHechizo();
        System.out.println("-> Harry cambia de hechizo a Expelliarmus");
        harry.setHechizo(new Expelliarmus());
        harry.lanzarHechizo();

        System.out.println();

        // Ron
        ron.lanzarHechizo();
        System.out.println("-> Ron cambia de hechizo a Wingardium Leviosa");
        ron.setHechizo(new WingardiumLeviosa());
        ron.lanzarHechizo();

        System.out.println();

        // Hermione
        hermione.lanzarHechizo();
        System.out.println("-> Hermione cambia de hechizo a Oculus Reparo");
        hermione.setHechizo(new OculusReparo());
        hermione.lanzarHechizo();
    }
}
