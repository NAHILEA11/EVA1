/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_tipos_de_datos;

/**
 *
 * @author Gerardo
 */
public class EVA1_3_TIPOS_DE_DATOS {

    public static void main(String[] args) {
        //TODO code application logic here 
        byte pruebaByte; // 1 byte = 8 bits > 256
        //pruebaByte =256; //256 no cabe en la variable
        pruebaByte = -127; 
        pruebaByte = 127; //acepta de -128 a 127 
        pruebaByte = -128; 
        
        short pruebaShort;//2 bytes = 16 bits = > 65536
        //pruebaShort = 32769; no cabe
        pruebaShort = -32768;
        pruebaShort = 32767;
        System.out.println(pruebaShort); // imrprime la variable PruebaShort
        pruebaShort++;//++ > operador, suma uno al contenido de la variable
        System.out.println(pruebaShort);
                
     
      
    }
}
