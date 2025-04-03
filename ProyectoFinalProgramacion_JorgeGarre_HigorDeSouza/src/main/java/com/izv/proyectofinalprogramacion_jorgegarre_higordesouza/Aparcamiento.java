/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorgegarre
 */
public class Aparcamiento {
    protected boolean libre;
    protected Coche coche; 
    protected int nplaza;

    public Aparcamiento(boolean libre, Coche coche, int nplaza) {
        this.libre = libre;
        this.coche = coche;
        this.nplaza = nplaza;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void setNplaza(int nplaza) {
        this.nplaza = nplaza;
    }

    public boolean isLibre() {
        return libre;
    }

    public Coche getCoche() {
        return coche;
    }

    public int getNplaza() {
        return nplaza;
    }
    
     public void aparcar(Coche coche, int plaza) {
         
     }
    
    
}
