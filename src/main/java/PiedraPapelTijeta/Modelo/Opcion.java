/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiedraPapelTijeta.Modelo;

/**
 *
 * @author pabloscotto87
 */
public enum Opcion {
    PIEDRA,
    PAPEL,
    TIJERA;
    
    public String toString(){
        switch(this){
        case PIEDRA :
            return "PIEDRA";
        case PAPEL :
            return "PAPEL";
        case TIJERA :
            return "TIJERA";
        }
        return null;
    }
    
    
}
