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

    public Furgoneta(double longitud, String matricula, Persona dueño, String marca, String modelo, String color) throws BadMatriculaException, FurgonetaDeMayorLongitudException {
        super(matricula, dueño, marca, modelo, color, "Furgoneta");
        setLongitud(longitud);
    }

    public void setLongitud(double longitud) throws FurgonetaDeMayorLongitudException {
        if (longitud >= 800) {
            throw new FurgonetaDeMayorLongitudException("");
        } else this.longitud = longitud;
    }
    
    

    public double getLongitud() {
        return longitud;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", longitud: " + longitud + " metros.";
    }

    
}
