/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jorgegarre
 */
public abstract class Hibrido extends Coche {
//    protected final int autonomia_real;
//    protected int autonomia_total;

//    public Hibrido(int autonomia_real, int autonomia_total, String matricula, Persona dueño, String marca, String modelo, String color) throws BadMatriculaException {
//        super(matricula, dueño, marca, modelo, color);
//        this.autonomia_real = autonomia_real;
//        this.autonomia_total = autonomia_total;
//    }

    public Hibrido(String matricula, Persona dueño, String marca, String modelo, String color) throws BadMatriculaException {
        super(matricula, dueño, marca, modelo, color);
    }

    
    

//    public void setAutonomia_total(int autonomia_total) {
//        this.autonomia_total = autonomia_total;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "Autonomia real: " + autonomia_real + " de " + autonomia_total;
//    }
    
    
    
}
