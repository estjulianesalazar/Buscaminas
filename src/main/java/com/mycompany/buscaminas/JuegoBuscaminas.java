/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buscaminas;

public class JuegoBuscaminas {
    
    private int puntaje;
    private int banderasColocadas;
    private Tablero tablero;
    private Jugador jugador;
    
    public JuegoBuscaminas(Tablero tablero, Jugador jugador){
        this.tablero = tablero;
        this.jugador = jugador;
    }
    
    public void colocarBandera(int f, int c){
        Celda cel = tablero.obtenerCasilla(f, c);
     
        if (!cel.estaDescubierta() && !cel.tieneBandera()){
            cel.colocarBandera();
            banderasColocadas++;
            jugador.colocarBandera();
        }
    }
    
    public void quitarBandera(int f, int c){
       Celda cel = tablero.obtenerCasilla(f, c);
       
       if (cel.tieneBandera()){
           cel.quitarBandera();
           banderasColocadas--;
           jugador.quitarBandera();
        }
    }
    
    public void EstadoJuego(){
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Puntaje: " + jugador.getPuntaje());
        System.out.println("Banderas: " + banderasColocadas); 
    }
}
