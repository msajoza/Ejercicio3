package juego.programa;

import juego.models.*;


public class Jugar {

	public static void main(String args[]) {
		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador();
		boolean teRmino = false;

		int valor;
		String selJ1, selJ2;

		do {
			System.out.println("Elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
			valor = Consola.readInt();
			while (!(valor >= 0 && valor < 3)) {
				System.out.print("La opci�n no es v�lida. Recuerda, elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
				valor = Consola.readInt();
			}
			selJ1 = j1.resultados[valor];
			selJ2 = j2.getResultado();

			System.out.println("Jugador 1: " + selJ1);
			System.out.println("Jugador 2: " + selJ2);

			if (selJ1.equals("PIEDRA") && selJ2.equals("PAPEL")) {
				j2.g++;
				System.out.println("Perdiste");
			} else if (selJ1.equals("PIEDRA") && selJ2.equals("TIJERA")) {
				j1.g++;
				System.out.println("Ganaste");
			} else if (selJ1.equals("PAPEL") && selJ2.equals("PIEDRA")) {
				j1.g++;
				System.out.println("Ganaste");
			} else if (selJ1.equals("PAPEL") && selJ2.equals("TIJERA")) {
				j2.g++;
				System.out.println("Perdiste");
			} else if (selJ1.equals("TIJERA") && selJ2.equals("PIEDRA")) {
				j2.g++;
				System.out.println("Perdiste");
			} else if (selJ1.equals("TIJERA") && selJ2.equals("PAPEL")) {
				j1.g++;
				System.out.println("Ganaste");
			} else {
				System.out.println("Empate");
			}
			

			System.out.println();
			System.out.println("Ganados Jugador 1: " + j1.getGanados());
			System.out.println("Ganados Jugador 2: " + j2.getGanados());
			System.out.println();
			System.out.println();

			if (j1.getGanados() == 3 || j2.getGanados() == 3) {
				teRmino = true;
				System.out.println(j1.getGanados() == 3 ? "GANASTE! :)" : "PERDISTE! :(");
			}
			System.out.println();
		} while (!teRmino);
		
	}

}
