package fernando.refactorizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.awt.*;
import java.util.*;
import static java.awt.color.ICC_Profile.CLASS_ABSTRACT;

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

	public static void main(String args[]) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        boolean teRmino = false;
        
        int valor;
        String selJ1, selJ2;
        
        do {
			System.out.println("Elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
			valor = Consola.readInt();
			while(!(valor >= 0 && valor < 3)) {
				System.out.print("La opci�n no es v�lida. Recuerda, elige 0: PIEDRA, 1: PAPEL, 2: TIJERA: ");
				valor = Consola.readInt();
							}
							selJ1 = j1.resultados[valor];
				        	selJ2 = j2.getResultado();
				            
				            System.out.println("Jugador 1: " + selJ1);
				            System.out.println("Jugador 2: " + selJ2);
				        	
				        	if(selJ1.equals("PIEDRA") && selJ2.equals("PAPEL")) {
				                j2.g ++;
				                System.out.println("Perdiste");
				            }
				            else if(selJ1.equals("PIEDRA") && selJ2.equals("TIJERA")) {
				            	j1.g ++;
				                System.out.println("Ganaste");
				            }
				            else if(selJ1.equals("PAPEL") && selJ2.equals("PIEDRA")) {
				                j1.g ++;
				                System.out.println("Ganaste");
				            }
            else if(selJ1.equals("PAPEL") && selJ2.equals("TIJERA")) {
            	j2.g ++;
                System.out.println("Perdiste");
            }
            else if(selJ1.equals("TIJERA") && selJ2.equals("PIEDRA")) {
            	j2.g ++;
                System.out.println("Perdiste");
            }
            else if(selJ1.equals("TIJERA") && selJ2.equals("PAPEL")) {
            	j1.g ++;
                System.out.println("Ganaste");
            }
            else {
                System.out.println("Empate");
            }
			/*	selJ1 = j1.resultados[valor];
				        	selJ2 = j2.getResultado();
				            
				            System.out.println("Jugador 1: " + selJ1);
				            System.out.println("Jugador 2: " + selJ2);
				        	
				        	if(selJ1.equals("PIEDRA") && selJ2.equals("PAPEL")) {
				                j2.g ++;
				                System.out.println("Perdiste");
				            }
				            else if(selJ1.equals("PIEDRA") && selJ2.equals("TIJERA")) {
				            	j1.g ++;
				                System.out.println("Ganaste");
				            }
				            else if(selJ1.equals("PAPEL") && selJ2.equals("PIEDRA")) {
				                j1.g ++;
				                System.out.println("Ganaste");
				            }
            else if(selJ1.equals("PAPEL") && selJ2.equals("TIJERA")) {
            	j2.g ++;
                System.out.println("Perdiste");
            }
            else if(selJ1.equals("TIJERA") && selJ2.equals("PIEDRA")) {
            	j2.g ++;
                System.out.println("Perdiste");
            }
            else if(selJ1.equals("TIJERA") && selJ2.equals("PAPEL")) {
            	j1.g ++;
                System.out.println("Ganaste");
            }
            else {
                System.out.println("Empate");
            }*/	        	
		
		        	System.out.println();
		            System.out.println("Ganados Jugador 1: " + j1.getGanados());
		            System.out.println("Ganados Jugador 2: " + j2.getGanados());
		            System.out.println();
		            System.out.println();
		            
		            if(j1.getGanados() == 3 || j2.getGanados() == 3) {
		                teRmino = true;
		                System.out.println(j1.getGanados() == 3 ? "GANASTE! :)" : "PERDISTE! :(");
		            }
		            System.out.println();
		        } while(!teRmino);
        //} while(!comenzar);
    }
    
}

class Jugador {

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

	String resultados[] = { "PIEDRA", "PAPEL", "TIJERA" };
    int g;

    public String getResultado() {
        String resultado = "";
        int i = (int)(Math.random() * 3);
        switch(i) {
            case 0:
            	resultado = "PIEDRA";
            	System.out.println();
                break;
                //resultado = "TIJERA";
                //break;1
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

class Consola extends Jugador {

    private static BufferedReader data;

    static {
        Consola.data = new BufferedReader(new InputStreamReader(System.in));
    }

   /* private Consola() {
    	Consola.data = new BufferedReader(new InputStreamReader(System.in));
    }*/

    public static String readLine() throws IOException {
		return Consola.data.readLine();
    }
    
    /*public static String readLine() throws IOException {
		return Consola.data.readLine();
    }*/
   
    public static int readInt() {
        while(true == true) {
            try {
                return Integer.parseInt(Consola.readLine().trim());
            }
			            catch(NumberFormatException ex) {
			                System.out.println("El valor ingresado no es \"INTEGER\", vuelva a intentar");
			            }
			            catch(IOException ex) {
			            }
            catch(Exception e) {
            	
            }
        }
    }
    
    @Override
    public int getGanados() {
        return g + 10;
    }
    
public String getResultado() {
    String resultado = "";
int i = (int)(Math.random() * 3);
switch(i) {
    case 0:
            	resultado = "PIEDRA";
			                break;
			            case 1:
			            	resultado = "PAPEL";
			                break;
			            case 2:
			            	resultado = "TIJERA";
			                break;
			        }
			        return resultado;
			    }

public String getResultado(String piedra, String papel, String tijera) {
    String resultado = "";
int i = (int)(Math.random() * 3);
switch(i) {
    case 0:
    	resultado = "PIEDRA";
        break;
            case 1:
            	resultado = "PAPEL";
                break;
                /*  case 1:
            	resultado = "PAPEL";
                break;*/
            case 2:
            	resultado = "TIJERA";
                break;
        }
        return resultado;
    }

}

