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
    protected String marca;
    protected String modelo;
    protected String color;
    protected final String  tipoVehiculo;

    public Vehiculo(String matricula, Persona dueño, String marca, String modelo, String color, String tipoVehiculo) throws BadMatriculaException {
        setMatricula(matricula);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
    }

     public void setMatricula(String matricula) throws BadMatriculaException {
        if (matricula.equals("")) throw new BadMatriculaException("");
        else this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    public Persona getDueño() {
        return dueño;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    
    
    
    @Override
    public String toString() {
        return tipoVehiculo + " con matrícula " + matricula + ": " + marca + " " + modelo +
            ", color " + color + ", dueño: " + dueño;
    }

    
    
}
