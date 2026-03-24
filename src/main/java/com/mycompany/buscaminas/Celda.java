/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buscaminas;

public class Celda {
    private int fila;
    private int columna;
    private boolean revelada;
    private boolean marcada;
    private int adyacentes;
    
    public Celda(int fila, int columna){
        
    }
    public boolean esMina(){
        return false;
    }
    public void setMina(boolean mina){
        
    }
    
    public boolean isRevelada(){
        return false;
    }
    
    public boolean revelar(){
        return false;
    }

    public boolean isMarcada(){
        return false;
    }
    public void marcar(){
        
    }
    public void desmarcar(){
        
    }
    
    public int getAdyacentes(){
        return 0;
    }
    
    public void setAdyacentes(int n){
        
    }
    
    public int getFila(){
        return 0;
    }
    public int getColumna(){
        return 0;
    }
}
