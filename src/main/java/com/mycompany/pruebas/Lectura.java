/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebas;

import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Lectura {
    
    public static String leerString(){
        String dato;
        Scanner leer=new Scanner (System.in);
        dato = leer.nextLine();
        return dato;
     }
    
    public static char leerChar(){
         char dato;
         Scanner leer=new Scanner (System.in);
         dato = leer.next().charAt(0); 
         return dato;
    }
    
    public static int leerInt(){
 //import java.util.Scanner;
        int dato;
        Scanner leer=new Scanner (System.in);
        dato=leer.nextInt();
        return dato;
    }
        
    public static float leerFloat(){
      float dato;
      Scanner leer=new Scanner (System.in);
      dato=leer.nextFloat();
      return dato;
    }
    
    public static double leerDouble(){
        double dato;
        Scanner leer=new Scanner (System.in);
        dato=leer.nextDouble();
        return dato;
    }
}