/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiedraPapelTijeta.Modelo;

import java.util.Arrays;

/**
 *
 * @author pabloscotto87
 */
public class Jugador extends Consola {

    private int ganados;
    private String nombre;
    
    public Jugador(){
    
    }

    public Jugador(String nombre) {
        this.ganados = 0;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanados() {
        return ganados;
    }

    private void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public void sumarGanado(){
        ganados++;
    }
    
    public String getResultadoRandom() {
        String resultado = "";
        int i = (int) (Math.random() * 3);
        switch (i) {
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

}
