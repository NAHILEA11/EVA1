/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva5_5_captura_datos;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA5_5_CAPTURA_DATOS {

    public static void main(String[] args) {
        //TODO code application logic here
        //DECLARAR NUESTRAS VARIABLES
        String nombre;
        int edad;
        
        System.out.println("introduce tu nombre: " );
        //CREAR NUESTRO ESCANER 
        Scanner captura = new Scanner (System.in);
        //CAPTURA
        nombre = captura.nextLine();
        System.out.println("Introduce tu edad:");
        edad = captura.nextInt();
        
        System.out.println("tu nombre: ");
        System.out.println(nombre);
        System.out.println("Tu edad es: ");
        System.out.println(edad);
                
                
                
                
                
                
        
        
    }
}
