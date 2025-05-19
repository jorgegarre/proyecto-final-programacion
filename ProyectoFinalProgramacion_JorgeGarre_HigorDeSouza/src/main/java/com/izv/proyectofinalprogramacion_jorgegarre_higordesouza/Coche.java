package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorgegarre
 */
public abstract class Coche extends Vehiculo {
    public Coche(String matricula, Persona dueño, String marca, String modelo, String color) throws BadMatriculaException {
        super(matricula, dueño, marca, modelo, color, "Coche");
    }

    
    
}
