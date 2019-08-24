/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.cadenacaracteres.cadenacaracteres;

import java.util.Scanner;

/**
 *
 * @author Leidy Torres
 */
public class Cadena {
    
    private Scanner teclado = new Scanner(System.in);
    /**
     * Constructor de la clase
     */
    public Cadena() {
    }
    /**
     * Metodo que pide los datos al usuario
     */
    public void obtenerDatos(){
        System.out.println("Ingrese la frase: ");
        String datos = teclado.nextLine();
        teclado.close();
        evaluarPalabra(datos);
    }
    
    /**
     * Metodo que evalua la primera letra que no se repite de la frase ingresada por el usuario
     * @param string 
     */
    public void evaluarPalabra(String string){
        String[] datos = string.split("");
        int contador = 0;
        int i, j ;
            for ( i = 0; i < datos.length; i++){ 
                System.out.println("Leyendo..." + datos[i]);
                for ( j = 0; j < datos.length; j++){
                    if (datos[i].equals(datos[j]) && j == 0){
                        contador++;
                        System.out.println("La primera letra que no se repite: " + datos[j]);
                    }
                    else{
                        break;
                    }
                }
                System.out.println("La primera letra que no se repite: " + datos[j]);        
            }           
    }
}

   

    
    
    
        
//}
    
    
