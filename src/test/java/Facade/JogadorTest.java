package Facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    void deveIniciarPartidaSemPendencias() {
        Jogador jogador = new Jogador();

        assertTrue(jogador.iniciarPartida());
    }

    @Test
    void naoDeveIniciarPartidaComPendenciaLogin() {
        Jogador jogador = new Jogador();
        Login.getInstancia().addJogadorPendente(jogador);

        assertFalse(jogador.iniciarPartida());
    }

    @Test
    void naoDeveIniciarPartidaComPendenciaDownload() {
        Jogador jogador = new Jogador();
        Download.getInstancia().addJogadorPendente(jogador);

        assertFalse(jogador.iniciarPartida());
    }

    @Test
    void naoDeveIniciarPartidaComPendenciaAmigos() {
        Jogador jogador = new Jogador();
        Amigos.getInstancia().addJogadorPendente(jogador);

        assertFalse(jogador.iniciarPartida());
    }

    @Test
    void naoDeveIniciarPartidaComPendenciaMatchmaking() {
        Jogador jogador = new Jogador();
        Matchmaking.getInstancia().addJogadorPendente(jogador);

        assertFalse(jogador.iniciarPartida());
    }
}