package com.mycompany.buscaminas;
 
public class Jugador {
 
    private String nombre;
    private int puntaje;
    private int banderasColocadas;
 
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
        this.banderasColocadas = 0;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public int getPuntaje() {
        return puntaje;
    }
 
    public void sumarPuntos(int puntos) {
        puntaje += puntos;
    }
 
    public void colocarBandera() {
        banderasColocadas++;
    }
 
    public void quitarBandera() {
        if (banderasColocadas > 0) {
            banderasColocadas--;
        }
    }
 
    public int getBanderasColocadas() {
        return banderasColocadas;
    }
}