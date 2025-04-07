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
    protected String marca;
    protected String modelo;
    protected String color;

    public Coche(String marca, String modelo, String color, String matricula, Persona dueño) throws BadMatriculaException {
        super(matricula, dueño, "Coche");
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    



    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public void setMatricula(String matricula) throws BadMatriculaException {
        if (matricula.equals("")) throw new BadMatriculaException("");
        else this.matricula = matricula;
        
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
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

    public Persona getDueño() {
        return dueño;
    }
    
    @Override
    public String toString() {
        return "El coche con matricula " + matricula + " es un " + marca + " modelo " + modelo + " de color " + color + " su dueño es " + dueño;
       
    }
    
    
}
