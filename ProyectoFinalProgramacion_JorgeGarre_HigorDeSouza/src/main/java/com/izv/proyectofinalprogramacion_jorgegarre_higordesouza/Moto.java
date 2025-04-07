/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorgegarre
 */
public class Moto extends Vehiculo {

    public Moto(String matricula, Persona dueño, String marca, String modelo, String color) throws BadMatriculaException {
        super(matricula, dueño, marca, modelo, color, "Moto");
    }

    @Override
    public String toString() {
            return "La moto con matrícula " + matricula + " su dueño es " + dueño + " es un " + marca + modelo + " de color " + color;
    }
    
}
