/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiedraPapelTijeta.Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pabloscotto87
 */
public abstract class Consola {

    private static BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

    public String readLine() throws IOException {
        return Consola.data.readLine();
    }

    public int readInt() {
        int valor = -1;
        try {
            valor = Integer.parseInt(readLine().trim());
        } catch (NumberFormatException ex) {
            System.out.println("El valor ingresado no es \"INTEGER\", vuelva a intentar");
        } catch (IOException ex) {
            System.out.println("Error al leer de consola: " + ex.toString());
        }
        return valor;
    }

}
