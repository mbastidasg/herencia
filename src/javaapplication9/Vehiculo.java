/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Estudiante
 */
public abstract class Vehiculo {
    protected int caballosDefuerza;
    
    public Vehiculo (int caballosDeFuerza){
        System.out.println("Constructor padre");
    }
    
    public void arrancar(){
        System.out.println("Arrancar");
    }
    public abstract void detener ();
    
}
