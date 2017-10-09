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
public class Automovil extends Vehiculo{
    private int cantidadDePuertas;
    
    public Automovil(int caballosDeFuerza, int cp){
        super(caballosDeFuerza);
        this.cantidadDePuertas = cp;   
    }
    
    public void acelerar (int cuanto){
        System.out.println("Acelerar");
        
    }
    //sobreescribir metodos cuando no me gusta lo heredado por el padre
    @Override
    public void arrancar(){
        System.out.println("Arrancar en hijo");
    }

    @Override
    public void detener() {
       
    }
   
}
