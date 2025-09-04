package juego.main;

import juego.hechizos.*;
import juego.personajes.Personaje;

public class Main {
    public static void main(String[] args) {
        Personaje harry = new Personaje("Harry Potter", new ExpectoPatronum());
        Personaje ron = new Personaje("Ron Weasley", new Expelliarmus());
        Personaje hermione = new Personaje("Hermione Granger", new WingardiumLeviosa());

        harry.lanzarHechizo();
        ron.lanzarHechizo();
        hermione.lanzarHechizo();
        
        hermione.setHechizo(new OculusReparo());
        hermione.lanzarHechizo();
    }
}
