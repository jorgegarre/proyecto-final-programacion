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
    
    public Combustion(String matricula, String marca, String modelo, String color,String combustible, Persona dueño) throws BadMatriculaException, BadCombustibleException {
        super(matricula, marca, modelo, color, dueño);
        setCombustible(combustible);
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
