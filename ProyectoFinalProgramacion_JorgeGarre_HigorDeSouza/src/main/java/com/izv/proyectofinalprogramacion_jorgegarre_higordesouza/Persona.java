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
    
    private final byte MINEDAD = 16;
    private final byte MAXEDAD = 80;
    
    // Atributos
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected byte edad;
    
    
    
    // Métodos
    
    public Persona(String nombre, String apellido, String dni, byte edad) throws IncorrectNameException, BadAgeException, BadDniException {
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setEdad(edad);
    }

    public void setNombre(String nombre) throws IncorrectNameException {
        if(nombre.equals("")) throw new IncorrectNameException("Nombre no valido");
        else this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(byte edad) throws BadAgeException {
        // Comprueba si la edad esta entre 0 y 120
        // y si no lanza una excepción
        if (edad >= MINEDAD && edad <= MAXEDAD) this.edad = edad;
        else throw new BadAgeException("Edad introducida no valida, debe estar entre 16 y 80");
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

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public byte getEdad() {
        return edad;
    }

    
    
    @Override
    public String toString() {
        return nombre + " " + apellido + " con dni " + dni + " tiene " + edad + " años ";
    }



}

