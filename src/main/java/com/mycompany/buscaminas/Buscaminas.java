package com.mycompany.buscaminas;
 
import com.murcia.utils.*;
 
public class Buscaminas {
 
    public static void main(String[] args) {
 
        String nombre = Input.next("Nombre: ");
        Jugador jugador = new Jugador(nombre);
 
        Tablero tablero = new Tablero(16, 16, 40);
        JuegoBuscaminas juego = new JuegoBuscaminas(tablero, jugador);
 
        String[] opciones = {
            "Descubrir",
            "Colocar bandera",
            "Quitar bandera",
            "Salir"
        };
 
        Menu menu = new Menu(opciones, '>', "----------", "BUSCAMINAS");
 
        boolean salir = false;
 
        while (!salir) {
 
            tablero.mostrarTablero();
            juego.estadoJuego();
 
            char op = menu.select("Opcion: ");
 
            int f, c;
 
            switch (op) {
 
                case 'D':
                    f = Input.nextInt("Fila (0-15): ", 0, 15);
                    c = Input.nextInt("Columna (0-15): ", 0, 15);
                    tablero.descubrirCasilla(f, c);
                    break;
 
                case 'C':
                    f = Input.nextInt("Fila (0-15): ", 0, 15);
                    c = Input.nextInt("Columna (0-15): ", 0, 15);
                    juego.colocarBandera(f, c);
                    break;
 
                case 'Q':
                    f = Input.nextInt("Fila (0-15): ", 0, 15);
                    c = Input.nextInt("Columna (0-15): ", 0, 15);
                    juego.quitarBandera(f, c);
                    break;
 
                case 'S':
                    salir = true;
                    break;
            }
        }
 
        System.out.println("Gracias por jugar, " + jugador.getNombre() + "!");
    }
}