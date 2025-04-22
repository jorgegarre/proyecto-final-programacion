package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorgegarre
 */
public class Persona {
    
    // Atributos
    protected String nombreCompleto;
    protected String dni;
    
    
    
    
    // Métodos
    
    public Persona(String nombre, String dni) throws IncorrectNameException, BadDniException {
        setnombreCompleto(nombre);
        setDni(dni);
    }

    public void setnombreCompleto(String nombre) throws IncorrectNameException {
        if(nombre.equals("")) throw new IncorrectNameException("Nombre no valido");
        else this.nombreCompleto = nombre;
    }

 

    // Chequear si un dni es correcto o no 
    public boolean checkDni(String myDni) {
        dni = myDni.toUpperCase();
        char caracter;
        boolean dni = false;
        boolean checkCaracter = false;
        if (myDni.length() == 9) {
            for (int i = 0; i <= myDni.length()-2; i++) {
                caracter = myDni.charAt(i);
                if (Character.isDigit(caracter)) {
                    // System.out.println("Bien");
                    checkCaracter = true;
                    
                }
            }
            caracter = myDni.charAt(8);
            if ((Character.isLetter(caracter)) && checkCaracter ) { 
                dni = true;
            }
        }
        return dni;
    }
   

    public void setDni(String dni) throws BadDniException {
        if(checkDni(dni.toUpperCase())) {
            this.dni = dni.toUpperCase();
        } else {
            throw new BadDniException("El DNI introducido no es validosdsdd");
        }
    }

    public String getnombreCompleto() {
        return nombreCompleto;
    }
    
    public String getDni() {
        return dni;
    }


    
    
    @Override
    public String toString() {
        return nombreCompleto + " con dni " + dni;
    }



}

