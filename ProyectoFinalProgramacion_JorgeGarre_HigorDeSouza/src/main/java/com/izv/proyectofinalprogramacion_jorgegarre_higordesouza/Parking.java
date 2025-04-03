/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgegarre
 */
public class Parking {
    protected String nombre;
    protected String direccion;
    protected int plazas_ocupadas;
    protected List<Aparcamiento> plazas = new ArrayList<>(MAXPLAZAS);
    protected List<Coche> coches = new ArrayList<>(); 
    protected static final int MAXPLAZAS = 30;

    public Parking(String nombre, String direccion, int plazas_ocupadas, List<Coche> coches) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.plazas_ocupadas = plazas_ocupadas;
        this.coches = coches;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPlazas_ocupadas(int plazas_ocupadas) {
        this.plazas_ocupadas = plazas_ocupadas;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }
   
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getPlazas_ocupadas() {
        return plazas_ocupadas;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public static int getMAXPLAZAS() {
        return MAXPLAZAS;
    }

    @Override
    public String toString() {
        return "El parking " + nombre + " en la dirección " + direccion + " tiene ocupadas " + plazas_ocupadas + " plazas y quedan libres " + (MAXPLAZAS-plazas_ocupadas);
    }

    
    
    
    
}
