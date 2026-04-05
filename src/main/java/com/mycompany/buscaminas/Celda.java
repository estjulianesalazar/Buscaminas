/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buscaminas;

public class Celda {
    
    private boolean mina;
    private boolean descubierta;
    private boolean bandera;
    private int minasAlrededor;
    
    public Celda(){
        mina = false;
        descubierta = false;
        bandera = false;
        minasAlrededor = 0;
    }
    
    public boolean tieneMina(){
        return mina;
    }
    public void colocarMina(){
        mina = true;
    }
    
    public void descubrir(){
        if (!bandera){
            descubierta = true;
        }
    }
    
    public boolean estaDescubierta(){
        return descubierta;
    }

    public void colocarBandera(){
        bandera = true;
    }
    
    public void quitarBandera(){
        bandera = false;
    }
    public boolean tieneBandera(){
        return bandera;
    }
    
    public int getMinasAlrededor(){
        return minasAlrededor;
    }
    
    public void setMinasAlrededor(int minas){
        minasAlrededor = minas;
    }
}
