package PiedraPapelTijeta.Modelo;

public class Juego {

    private Jugador[] jugadores = new Jugador[2];
    private static Juego juego;

    public static Juego getSingleton(Jugador j1, Jugador j2) {
        if (juego == null) {
            juego = new Juego(j1, j2);
        } else {
            System.out.println("Ya hay un juego empezado");
        }
        return juego;
    }

    private Juego(Jugador j1, Jugador j2) {
        jugadores[0] = j1;
        jugadores[1] = j2;
    }

    public String valorAleatorioJugadorRandom() {
        return juego.jugadores[1].getResultadoRandom();
    }

    public int leerValor() {
        return juego.jugadores[0].readInt();
    }

    public void validarPartida(String valor1, String valor2) {
        if (valor1.equals(Opcion.PIEDRA.toString()) && valor2.equals(Opcion.PAPEL.toString())) {
            aumentarGanado(1);
            System.out.println("Perdiste");
        } else if (valor1.equals(Opcion.PIEDRA.toString()) && valor2.equals(Opcion.TIJERA.toString())) {
            aumentarGanado(0);
            System.out.println("Ganaste");
        } else if (valor1.equals(Opcion.PAPEL.toString()) && valor2.equals(Opcion.PIEDRA.toString())) {
            aumentarGanado(0);
            System.out.println("Ganaste");
        } else if (valor1.equals(Opcion.PAPEL.toString()) && valor2.equals(Opcion.TIJERA.toString())) {
            aumentarGanado(1);
            System.out.println("Perdiste");
        } else if (valor1.equals(Opcion.TIJERA.toString()) && valor2.equals(Opcion.PIEDRA.toString())) {
            aumentarGanado(1);
            System.out.println("Perdiste");
        } else if (valor1.equals(Opcion.TIJERA.toString()) && valor2.equals(Opcion.PAPEL.toString())) {
            aumentarGanado(0);
            System.out.println("Ganaste");
        } else {
            System.out.println("Empate");
        }
    }

    public void imprimirMarcador() {
        System.out.println();
        System.out.println("Ganados Jugador 1: " + juego.jugadores[0].getGanados());
        System.out.println("Ganados Jugador 2: " + juego.jugadores[1].getGanados());
        System.out.println();
    }

    public void imprimirGanador() {
        System.out.println(juego.jugadores[0].getGanados() == 3 ? "GANASTE "+juego.jugadores[0].getNombre()+"! :)" : "PERDISTE! :(");
    }

    public boolean validarGanador() {
        if (juego.jugadores[0].getGanados() == 3 || juego.jugadores[1].getGanados() == 3) {
            return true;
        } else {
            return false;
        }
    }

    public void aumentarGanado(int Jugador) {
        juego.jugadores[Jugador].sumarGanado();
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public Juego clone() {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase SoyUnico");
        }
        return null;
    }

}
