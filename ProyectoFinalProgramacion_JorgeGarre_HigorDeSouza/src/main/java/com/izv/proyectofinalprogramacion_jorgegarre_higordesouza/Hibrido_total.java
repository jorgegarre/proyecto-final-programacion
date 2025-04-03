/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorgegarre
 */
public class Hibrido_total extends Hibrido {
    protected final boolean enchufable = false; 

    public Hibrido_total(int autonomia_real, int autonomia_total, String matricula, String marca, String modelo, String color, Persona dueño) throws BadMatriculaException {
        super(autonomia_real, autonomia_total, matricula, marca, modelo, color, dueño);
    }


    @Override
    public String toString() {
        return super.toString() + " HIBRIDO TOTAL";
    }
    
    
}
