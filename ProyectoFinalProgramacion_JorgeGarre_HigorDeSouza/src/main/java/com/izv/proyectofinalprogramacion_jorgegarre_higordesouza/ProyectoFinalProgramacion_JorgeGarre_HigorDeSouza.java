/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgegarre
 */
public class ProyectoFinalProgramacion_JorgeGarre_HigorDeSouza {
    public static void main(String[] args) {
//    List<Persona> clientes = new ArrayList<>();
//    List<Coche> coches = new ArrayList<>();
//        
//        try {
//            clientes.add(new Persona("Carlos", "Pérez", "12345678A", (byte) 30));
//            clientes.add(new Persona("María", "López", "87654321B", (byte) 40));
//            clientes.add(new Persona("Juan", "González", "45678912C", (byte) 35));
//            clientes.add(new Persona("Ana", "Torres", "78912345D", (byte) 28));
//            clientes.add(new Persona("Luis", "Martínez", "32165498E", (byte) 45));
//            
//
//            coches.add(new Combustion("1234ABC", "Ford", "Focus", "Rojo", "Gasolina", clientes.get(0)));
//            coches.add(new Combustion("5678DEF", "Volkswagen", "Golf", "Azul", "Diesel", clientes.get(1)));
//            coches.add(new Combustion("9101GHI", "BMW", "Serie 3", "Negro", "Gasolina", clientes.get(2)));
//
//            // Creando coches híbridos enchufables
//            coches.add(new Hibrido_enchufable(40, 100, "1122JKL", "Toyota", "Prius", "Verde", clientes.get(3)));
//            coches.add(new Hibrido_enchufable(50, 120, "3344MNO", "Hyundai", "Ioniq", "Blanco", clientes.get(4)));
//            coches.add(new Hibrido_enchufable(45, 110, "5566PQR", "Mercedes", "Clase C", "Gris", clientes.get(0)));
//
//            // Creando coches híbridos totales
//            coches.add(new Hibrido_total(60, 130, "7788STU", "Lexus", "UX 250h", "Azul", clientes.get(1)));
//            coches.add(new Hibrido_total(55, 125, "9900VWX", "Honda", "CR-V Hybrid", "Negro", clientes.get(2)));
//            coches.add(new Hibrido_total(65, 140, "1133YZA", "Ford", "Kuga Hybrid", "Blanco", clientes.get(3)));
//            coches.add(new Hibrido_total(70, 150, "2244BCD", "Toyota", "Corolla Hybrid", "Rojo", clientes.get(4)));
//
//
//        } catch (BadAgeException | BadDniException | IncorrectNameException | BadMatriculaException | BadCombustibleException e) {
//            System.out.println(e.getMessage());
//        }
//        
//        for (Coche coche : coches) {
//            System.out.println(coche);
//        }
//

 try {
            // Crear una persona (dueño del coche)
            Persona dueño = new Persona("Carlos", "Pérez", "12345678A", (byte) 30);

            // Crear un coche de combustión
            Combustion coche = new Combustion("Gasolina", "1234ABC", dueño, "Toyota", "Corolla", "Rojo");
            
            // Mostrar información del coche
            System.out.println("Coche creado:");
            System.out.println(coche.toString());
            System.out.println("Tipo de combustible: " + coche.getCombustible());

        } catch (BadAgeException | BadDniException | IncorrectNameException | BadMatriculaException | BadCombustibleException e) {
            System.out.println("Error al crear el coche: " + e.getMessage());
        }
    }
    
    }
    
    

