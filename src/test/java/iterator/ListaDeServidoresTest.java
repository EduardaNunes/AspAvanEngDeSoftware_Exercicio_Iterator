package iterator;

import org.example.iterator.ListaDeServidores;
import org.example.iterator.Player;
import org.example.iterator.Servidor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaDeServidoresTest {

    @Test
    void deveContarPlayersOnlineNoServidor() {
        Servidor servidor = new Servidor(
                new Player("Player1", true),
                new Player("Player2", true),
                new Player("Player3", false),
                new Player("Player4", true)
        );
        assertEquals(3, ListaDeServidores.contarPlayersOnlineNoServidor(servidor));
    }

    @Test
    void deveContarTotalDePlayersCriadosNoServidor() {
        Servidor servidor = new Servidor(
                new Player("Player1", true),
                new Player("Player2", false),
                new Player("Player3", false),
                new Player("Player4", true)
        );
        assertEquals(4, ListaDeServidores.contarTotalDePlayersCriadosNoServidor(servidor));
    }

}
