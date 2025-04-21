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
    List<Persona> clientes = new ArrayList<>();


     try {
            // Crear personas
            Persona p1 = new Persona("Lucía", "Gómez", "12345678A", (byte) 25);
            Persona p2 = new Persona("Carlos", "Pérez", "87654321B", (byte) 40);
            Persona p3 = new Persona("María", "López", "11223344C", (byte) 31);

            // Crear vehículos
            Vehiculo coche1 = new Coche("1234ABC", "COCHE");
            Vehiculo coche2 = new Coche("5678DEF", "COCHE");
            Vehiculo moto1 = new Moto("M123XYZ", "MOTO");
            Vehiculo furgoneta1 = new Furgoneta("F444QWE", "FURGONETA", 6.5);
            Vehiculo coche3 = new Coche("9999ZZZ", "COCHE");

            // Crear el Map
            Map<Persona, List<Vehiculo>> personasVehiculos = new HashMap<>();

            // Asignar vehículos a personas
            personasVehiculos.put(p1, new ArrayList<>(List.of(coche1, moto1)));
            personasVehiculos.put(p2, new ArrayList<>(List.of(coche2, furgoneta1)));
            personasVehiculos.put(p3, new ArrayList<>(List.of(coche3)));

        } catch (BadMatriculaException | FurgonetaDeMayorLongitudException e) {
            System.out.println("Error al crear vehículo: " + e.getMessage());
        }
    
    
    }
}
    
    

