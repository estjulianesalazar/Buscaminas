/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buscaminas;

import com.murcia.utils.ListaEnlazada;
import java.util.Random;

public class Tablero {
    
    private ListaEnlazada<Celda> casillas;
    private int filas = 16;
    private int columnas = 16;
    private int minas = 40;
    
    public Tablero(int filas, int columnas, int minas){
        this.filas = filas;
        this.columnas = columnas;
        this.minas = minas;
        
        casillas = new ListaEnlazada<>();
        
        generarTablero();
        colocarMinas();
        calcularMinas();
    }
    
    public void inicializar(){
        
    }
    
    private void generarMinas(){
        
    }
    private void calcularAdyacentes(){
        
    }
    
    public Celda obtenerCelda(int fila, int columna){
        return null;
    }
    public void revelar(int fila, int columna){
        
    }
    public void marcar(int fila,int columna){
        
    }
}
