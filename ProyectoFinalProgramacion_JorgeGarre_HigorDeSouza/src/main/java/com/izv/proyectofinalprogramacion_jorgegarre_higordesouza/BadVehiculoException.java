/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorgegarre
 */
public class BadVehiculoException extends Exception {

    public BadVehiculoException(String message) {
        super("El tipo de vehículo introducido no es válido, solo se aceptan Coches, Furgonetas, Motos");
    }
    
}
