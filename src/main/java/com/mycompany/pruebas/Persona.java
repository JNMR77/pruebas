/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebas;

/**
 *
 * @author jorge
 */
public class Persona {
    private String nombre="Juan Perez";
    private int edad=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarDeInstancia(){
      System.out.println(this.nombre+", "+this.edad);
      
    }
    
    public static void mostrarDeClase(){
      System.out.println("Esta es de Clase");
    }
}
