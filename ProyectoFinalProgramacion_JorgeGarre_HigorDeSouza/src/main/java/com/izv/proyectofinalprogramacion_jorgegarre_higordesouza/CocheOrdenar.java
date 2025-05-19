/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

/**
 *
 * @author jorge
 */
public class CocheOrdenar {
    private String matricula;
    private String marca;
    private String tipoPlaza;
    private double tarifa;
    private boolean electrico;

    private int plaza;              // NUEVO
    private String fechaEntrada;    // NUEVO

    public CocheOrdenar(String matricula, String marca, String tipoPlaza, double tarifa, boolean electrico) {
        this.matricula = matricula;
        this.marca = marca;
        this.tipoPlaza = tipoPlaza;
        this.tarifa = tarifa;
        this.electrico = electrico;
    }

    // Constructor extendido para informes ordenados
    public CocheOrdenar(int plaza, String matricula, String tipoPlaza, double tarifa, boolean electrico, String fechaEntrada) {
        this.plaza = plaza;
        this.matricula = matricula;
        this.tipoPlaza = tipoPlaza;
        this.tarifa = tarifa;
        this.electrico = electrico;
        this.fechaEntrada = fechaEntrada;
        this.marca = "SinMarca"; // Marca ficticia si no se proporciona
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoPlaza() {
        return tipoPlaza;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isElectrico() {
        return electrico;
    }

    // Nuevos getters
    public int getPlaza() {
        return plaza;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula +
               ", Marca: " + marca +
               ", Tipo plaza: " + tipoPlaza +
               ", Tarifa: " + tarifa +
               ", Eléctrico: " + (electrico ? "Sí" : "No");
    }
}
