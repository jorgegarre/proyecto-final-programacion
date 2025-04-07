/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorgegarre
 */
public abstract class Vehiculo {
    protected String matricula;
    protected Persona dueño;
    protected String  tipoVehiculo;

    public Vehiculo(String matricula, Persona dueño, String tipoVehiculo) throws BadMatriculaException {
        this.matricula = matricula;
        this.dueño = dueño;
        this.tipoVehiculo = tipoVehiculo;
    }

     public void setMatricula(String matricula) throws BadMatriculaException {
        if (matricula.equals("")) throw new BadMatriculaException("");
        else this.matricula = matricula;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        String phrase = "";
         switch (tipoVehiculo) {
            case "Coche":
                phrase = "El vehiculo con matrícula " + matricula + " es el " + tipoVehiculo + " de " + dueño;
            case "Moto":
                phrase = "El vehiculo con matrícula " + matricula + " es la " + tipoVehiculo + " de " + dueño;
            case "Furgoneta":
                phrase = "El vehiculo con matrícula " + matricula + " es la " + tipoVehiculo + " de " + dueño;
        }
         
         return phrase;
    }
    
    
    
    
    
}
