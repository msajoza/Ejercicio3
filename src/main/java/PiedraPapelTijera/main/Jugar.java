package PiedraPapelTijera.main;

import PiedraPapelTijeta.Modelo.Juego;
import PiedraPapelTijeta.Modelo.Jugador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pabloscotto87
 */
public class Jugar {

    public static void main(String args[]) {
        int valor;
        String resultados[] = {"PIEDRA", "PAPEL", "TIJERA"};
        String name = null;
        Jugador player1 = new Jugador();
        try {
            System.out.println("Ingrese el nombre del jugador: ");
            name = player1.readLine();
            while (name.length() < 2 || name.isEmpty()) {
                System.out.println("Nombre demasiado corto, reintente!");
                name = player1.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Jugar.class.getName()).log(Level.SEVERE, null, ex);
        }
        player1.setNombre(name);
        Jugador player2 = new Jugador("Random");

        Juego game = Juego.getSingleton(player1, player2);

        while (!game.validarGanador()) {
            System.out.println("Elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
            valor = game.leerValor();

            while (!(valor >= 0 && valor < 3)) {
                System.out.print("La opción no es válida. Recuerda, elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
                valor = game.leerValor();
            }
            System.out.println("Elegiste: " + resultados[valor]);

            String valorRandom = game.valorAleatorioJugadorRandom();
            System.out.println("Jugador 2: " + valorRandom);

            game.validarPartida(resultados[valor], valorRandom);

            game.imprimirMarcador();

        }

        game.imprimirGanador();

//        int valor;
//        String selJ1, selJ2;
//        
//        
//
//        do {
//            System.out.println("Elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
//            valor = player1.readInt();
//            while (!(valor >= 0 && valor < 3)) {
//                System.out.print("La opción no es válida. Recuerda, elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
//                valor = player1.readInt();
//            }
//            String[] res = new String[3];
//            res = player1.getResultados();
//            selJ1 = res[valor];
//            selJ2 = player2.getResultadoRandom();
//
//            System.out.println("Jugador 1: " + selJ1);
//            System.out.println("Jugador 2: " + selJ2);
//
//            if (selJ1.equals("PIEDRA") && selJ2.equals("PAPEL")) {
//                player2.sumarGanado();
//                System.out.println("Perdiste");
//            } else if (selJ1.equals("PIEDRA") && selJ2.equals("TIJERA")) {
//                player1.sumarGanado();
//                System.out.println("Ganaste");
//            } else if (selJ1.equals("PAPEL") && selJ2.equals("PIEDRA")) {
//                player1.sumarGanado();
//                System.out.println("Ganaste");
//            } else if (selJ1.equals("PAPEL") && selJ2.equals("TIJERA")) {
//                player2.sumarGanado();
//                System.out.println("Perdiste");
//            } else if (selJ1.equals("TIJERA") && selJ2.equals("PIEDRA")) {
//                player2.sumarGanado();
//                System.out.println("Perdiste");
//            } else if (selJ1.equals("TIJERA") && selJ2.equals("PAPEL")) {
//                player1.sumarGanado();
//                System.out.println("Ganaste");
//            } else {
//                System.out.println("Empate");
//            }
//
//            System.out.println();
//            System.out.println("Ganados Jugador 1: " + player1.getGanados());
//            System.out.println("Ganados Jugador 2: " + player2.getGanados());
//            System.out.println();
//            System.out.println();
//
//            if (player1.getGanados() == 3 || player2.getGanados() == 3) {
//                termino = true;
//                System.out.println(player1.getGanados() == 3 ? "GANASTE! :)" : "PERDISTE! :(");
//            }
//            System.out.println();
//        } while (!termino);
    }
}
