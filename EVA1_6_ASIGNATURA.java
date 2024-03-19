/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class EVA1_6_ASIGNATURA {

    public static void main(String[] args) {
        //TODO code application logic here
        //clave, nombre, creditos, hrTeo, htPr, carrera
        //tipoMat
        String clave, nombre, carrera;
        int creditos, horasTeo, horasPrac;
        boolean tipoMat;
        //CAPTURAR
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura:");
        clave = captu.nextLine();
        System.out.println("Introduce el nombre de la asignatura:");
        nombre = captu.nextLine();
        System.out.println("Introduce la carrera de la asignatura:");
        carrera = captu.nextLine();
        System.out.println("Introduce los creditos de la asignatura");
        creditos = captu.nextInt();
        System.out.println("Introduce las horas teoricas de la asignatura:");
        horasTeo = captu.nextInt();
        System.out.println("Introduce las horas parcticas de la asignatura:");
        horasPrac = captu.nextInt();
        System.out.println("Introduce el tipo de la asignatura [TRUE  > generica, false > especialidad] :");   
        tipoMat = captu.nextBoolean();
        
        //HACER ALGO CON LOS DATOS CAPTURADOS
        System.out.println("DATOS DE LA ASIGNATURA");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(horasTeo);
        System.out.println(horasPrac);
        System.out.println(tipoMat);            
        
        
       
    }
}
