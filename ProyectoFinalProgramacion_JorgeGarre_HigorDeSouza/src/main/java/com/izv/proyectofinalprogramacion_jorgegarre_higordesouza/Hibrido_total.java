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

    public Hibrido_total(int autonomia_real, int autonomia_total, String matricula, Persona dueño, String marca, String modelo, String color) throws BadMatriculaException {
        super(autonomia_real, autonomia_total, matricula, dueño, marca, modelo, color);
    }




    @Override
    public String toString() {
        return super.toString() + " HIBRIDO TOTAL";
    }
    
    
}
