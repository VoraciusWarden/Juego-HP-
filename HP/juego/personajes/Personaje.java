package juego.personajes;

import juego.hechizos.Hechizo;

public class Personaje {
    private String nombre;
    private Hechizo hechizo;

    public Personaje(String nombre, Hechizo hechizo) {
        this.nombre = nombre;
        this.hechizo = hechizo;
    }

    public void setHechizo(Hechizo hechizo) {
        this.hechizo = hechizo;
    }

    public void lanzarHechizo() {
        System.out.print("-> " + nombre + " lanza: ");
        hechizo.ejecutar();
    }
}
