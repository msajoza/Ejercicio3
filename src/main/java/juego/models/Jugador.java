package juego.models;

import java.util.Arrays;



public class Jugador {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + g;
		result = prime * result + Arrays.hashCode(resultados);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (g != other.g)
			return false;
		if (!Arrays.equals(resultados, other.resultados))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Jugador [resultados=" + Arrays.toString(resultados) + ", g=" + g + "]";
	}

	public String[] getResultados() {
		return resultados;
	}

	public void setResultados(String[] resultados) {
		this.resultados = resultados;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public String resultados[] = { "PIEDRA", "PAPEL", "TIJERA" };
	public int g;

	public String getResultado() {
		String resultado = "";
		int i = (int) (Math.random() * 3);
		switch (i) {
		case 0:
			resultado = "PIEDRA";
			System.out.println();
			break;
		// resultado = "TIJERA";
		// break;1
		case 1:
			resultado = "PAPEL";
			System.out.println();
			break;
		case 2:
			resultado = "TIJERA";
			System.out.println();
			break;
		}
		return resultado;
	}

	public int getGanados() {
		return g;
	}

}
