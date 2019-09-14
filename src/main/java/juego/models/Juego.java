package juego.models;

public abstract class Juego {

	public static final String Ganaste = "Ganaste";
	public static final String Perdiste = "Perdiste";
	public static final String Empate = "Ganaste";

	public static String getGanaste() {
		return Ganaste;
	}

	public static String getPerdiste() {
		return Perdiste;
	}

	public static String getEmpate() {
		return Empate;
	}

}
