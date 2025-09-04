package juego.hechizos;

public class Expelliarmus implements Hechizo {
    @Override
    public void ejecutar() {
        System.out.println("Expelliarmus!!! \n* El oponente pierde su varita. *");
    }
}

