package Facade;

public class PlataformaFacade {

    public static boolean verificarPendenciasPartida(Jogador jogador) {
        if (Login.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        if (Download.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        if (Amigos.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        if (Matchmaking.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        return true;
    }
}