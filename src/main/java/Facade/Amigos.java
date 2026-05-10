package Facade;

public class Amigos extends Servico {

    private static Amigos amigos = new Amigos();

    private Amigos() {}

    public static Amigos getInstancia() {
        return amigos;
    }
}