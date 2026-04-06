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
    public void calcularMinasAlrededor() {
        for (int f = 0; f < filas; f++){
            for (int c = 0; c < columnas; c++){
                
                int contador = 0;
                
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++){
                        
                        int nf = f + i;
                        int nc = c + j;
                        
                        if (nf >= 0 && nf < filas && nc >= 0 && nc < columnas)
                            if (obtenerCasilla(nf, nc).tieneMina()){
                                contador++;
                            }
                    }
                }
            }
            
        obtenerCasilla(f, c).setMinasAlrededor(contador);
        }
    }
}

public void descubrirCasilla(int fila, int columna){
    Celda c = obtenerCasilla(fila, columna);
    c.descubrir();
    
    if (c.tieneMina()){
        System.out.println("!Pisaste una Mina¡");
    }
}

public void mostrarTablero(){
    
    for (int f = 0; f < filas; f++){
        for (int c = 0; c < columnas; c++){
            
            Celda cel = obtenerCasilla(f, c);
            
            if(!cel.estaDescubierta()){
                if (cel.tieneBandera()){
                    System.out.print("B ");
                } else {
                    System.out.print(". ");
                }
            } else {
                if (cel.tieneMina()){
                    System.out.print("* ");
                } else {
                    System.out.print(cel.getMinasAlrededor() + " ");
                }
            }
        }
        System.out.println();
    }
}

