package Facade;

public class Matchmaking extends Servico {

    private static Matchmaking matchmaking = new Matchmaking();

    private Matchmaking() {}

    public static Matchmaking getInstancia() {
        return matchmaking;
    }
}