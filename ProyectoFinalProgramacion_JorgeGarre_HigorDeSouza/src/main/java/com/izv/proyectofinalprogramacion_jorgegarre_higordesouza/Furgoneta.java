/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorge
 */
public class Furgoneta extends Vehiculo {

    protected double longitud;

    public Furgoneta(double longitud, String matricula, Persona dueño, String marca, String modelo, String color, String tipoVehiculo) throws BadMatriculaException {
        super(matricula, dueño, marca, modelo, color, tipoVehiculo);
        this.longitud = longitud;
    }
    
    @Override
    public String toString() {
        return "La furgoneta con matrícula " + matricula + " su dueño es " + dueño + " es un " + marca + modelo + " de color " + color;
    }
    
}
