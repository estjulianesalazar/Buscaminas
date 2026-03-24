/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscaminas;

public class Buscaminas {

     public static void main(String[] args) {
         
         String nombre = Input.next("Ingrese su nombre: ");
         Jugador jugador  = new Jugador(nombre);
         
         Tablero tablero = new Tablero(5, 5);
         Juego juego = new Juego(tablero, jugador);
         
         juego.iniciarJuego();
 
    }
}