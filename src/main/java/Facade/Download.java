package Facade;

public class Download extends Servico {

    private static Download download = new Download();

    private Download() {}

    public static Download getInstancia() {
        return download;
    }
}