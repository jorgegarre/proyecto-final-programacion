/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorgegarre
 */
public class Moto {
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String color;
    protected Persona dueño;

    public Moto(String matricula, String marca, String modelo, String color, Persona dueño) throws BadMatriculaException {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
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

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
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
    
    
    
    
}
