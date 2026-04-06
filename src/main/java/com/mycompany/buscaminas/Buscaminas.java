/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscaminas;
import com.murcia.utils.*;

public class Buscaminas {
    
     public static void main(String[] args) {
     
         String nombre = Input.next("Nombre: ");
         Jugador jugador = new Jugador(nombre);
         
         Tablero tablero = new Tablero(5, 5, 5);
         Juego juego = new Juego(tablero, jugador);
         
         String[] opciones = {
           "Descubrir",
           "Colocar Bandera",
           "Quitar Bandera",
           "Salir"
         };
         
         Menu menu = new Menu(opciones, '>', "BuUSCAMINAS", "----");
         
         boolean salir = false;
         
         while (!salir){
             
             tablero.mostrarTablero();
             juego.estadoJuego();
             
             char op = menu.select("Opcion:");
             
             int f, c;
             
             switch (op){
                 
                 case '1':
                     f = Input.nextInt("Fila:", 0, 4);
                     c = Input.nextInt("Columna:", 0, 4);
             }
         }
     }
}