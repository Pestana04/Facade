package Facade;

public class Jogador {

    public boolean iniciarPartida() {
        return PlataformaFacade.verificarPendenciasPartida(this);
    }
}