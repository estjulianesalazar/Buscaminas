package com.mycompany.buscaminas;
 
public class JuegoBuscaminas {
 
    private int banderasColocadas;
    private Tablero tablero;
    private Jugador jugador;
 
    public JuegoBuscaminas(Tablero tablero, Jugador jugador) {
        this.tablero = tablero;
        this.jugador = jugador;
        this.banderasColocadas = 0;
    }
 
    public void colocarBandera(int f, int c) {
        Celda cel = tablero.obtenerCasilla(f, c);
 
        if (!cel.estaDescubierta() && !cel.tieneBandera()) {
            cel.colocarBandera();
            banderasColocadas++;
            jugador.colocarBandera();
        } else if (cel.estaDescubierta()) {
            System.out.println("No puedes colocar una bandera en una casilla descubierta.");
        } else {
            System.out.println("Ya hay una bandera en esa casilla.");
        }
    }
 
    public void quitarBandera(int f, int c) {
        Celda cel = tablero.obtenerCasilla(f, c);
 
        if (cel.tieneBandera()) {
            cel.quitarBandera();
            banderasColocadas--;
            jugador.quitarBandera();
        } else {
            System.out.println("No hay bandera en esa casilla.");
        }
    }
 
    public void estadoJuego() {
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Puntaje: " + jugador.getPuntaje());
        System.out.println("Banderas colocadas: " + banderasColocadas);
    }
}