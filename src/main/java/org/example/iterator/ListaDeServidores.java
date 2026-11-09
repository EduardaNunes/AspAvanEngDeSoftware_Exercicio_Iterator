package org.example.iterator;

import java.util.Iterator;

public class ListaDeServidores {

    public static Integer contarPlayersOnlineNoServidor(Servidor servidor) {
        int quantidade = 0;
        for (Player player : servidor) {
            if (player.isOnline()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalDePlayersCriadosNoServidor(Servidor servidor) {
        int quantidade = 0;
        for (Iterator a = servidor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
