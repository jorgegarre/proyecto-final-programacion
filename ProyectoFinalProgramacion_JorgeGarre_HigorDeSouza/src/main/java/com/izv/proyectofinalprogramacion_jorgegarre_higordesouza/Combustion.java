/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorgegarre
 */
public class Combustion extends Coche {
    protected String combustible;

    public Combustion(String combustible, String matricula, Persona dueño, String marca, String modelo, String color) throws BadMatriculaException, BadCombustibleException {
        super(matricula, dueño, marca, modelo, color);
        setCombustible(combustible.toUpperCase());
    }
    
    public void setCombustible(String combustible) throws BadCombustibleException {
        switch (combustible.toUpperCase()) {
            case "GASOLINA":
                this.combustible = combustible;
                break;
            case "DIESEL":
                this.combustible = combustible;
                break;
            default:
                throw new BadCombustibleException("El tipo de combustible no es valido " + combustible + " debe ser Gasolina o Diesel");
                
        }
    }

    public String getCombustible() {
        return combustible;
    }
    
    
}
