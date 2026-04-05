/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buscaminas;

import com.murcia.utils.ListaEnlazada;
import java.util.Random;

public class Tablero {
    
    private ListaEnlazada<Celda> casillas;
    private int filas;
    private int columnas;
    private int minas;
    
    public Tablero(int filas, int columnas, int minas){
        this.filas = filas;
        this.columnas = columnas;
        this.minas = minas;
        
        casillas = new ListaEnlazada<>();
        
        generarTablero();
        colocarMinas();
        calcularMinasAlrededor();
    }
    
    private void generarTablero(){
        for (int i = 0; i < filas * columnas; i++){
            casillas.add(new Celda());
        }
    }
    
    public Celda obtenerCasilla(int fila, int columna){
        int pos = fila * columnas + columna;
        return casillas.get(pos);
    }
    private void colocarMinas(){
        Random r = new Random();
        int colocadas = 0;
    
        while(colocadas < minas){
            int pos = r.nextInt(filas * columnas);
            Celda c = casillas.get(pos);
            
            if(!c.tieneMina()){
                c.colocarMina();
                colocadas++;
            }
        }
    }
    
    public void marcar(int fila,int columna){
        
    }
}
