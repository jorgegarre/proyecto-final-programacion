/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorgegarre
 */
public class BadMatriculaException extends Exception {

    public BadMatriculaException(String message) {
        super("La matrículo introducida no es válida");
    }
    
}
