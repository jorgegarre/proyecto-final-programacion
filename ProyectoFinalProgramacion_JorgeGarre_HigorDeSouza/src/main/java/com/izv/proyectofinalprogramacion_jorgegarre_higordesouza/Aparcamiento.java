/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izv.proyectofinalprogramacion_jorgegarre_higordesouza;

import java.time.LocalDateTime;

/**
 *
 * @author jorgegarre
 */
public class Aparcamiento {
    protected boolean libre;
    protected Vehiculo vehiculo; 
    protected int nplaza;
    protected String tipoPlaza;
    protected double tarifaHora = 1.7;
    protected double longitudMaxima = 7.0;
    protected LocalDateTime fechaEntrada;
    protected LocalDateTime fechaSalida;

    public Aparcamiento(boolean libre, Vehiculo vehiculo, int nplaza, String tipoPlaza) {
        this.libre = libre;
        this.vehiculo = vehiculo;
        this.nplaza = nplaza;
        this.tipoPlaza = tipoPlaza;
    }
    
    
    public void setTipoPlaza(String tipoPlaza) throws BadTipoPlazaException {
        switch (tipoPlaza.toUpperCase()) {
            case "COCHE":
                this.tipoPlaza = tipoPlaza.toUpperCase();
                break;
            case "MOTO":
                this.tipoPlaza = tipoPlaza.toUpperCase();
                break;
            case "FURGONETA":
                this.tipoPlaza = tipoPlaza.toUpperCase();
                
                break;
            default:
                throw new BadTipoPlazaException("El tipo de plaza introducido no es válido, solo existen plazas de Coches, Motos o Furgonetas");
        }
    }
    
    
    

//
//    public void setLibre(boolean libre) {
//        this.libre = libre;
//    }
//
//    public void setCoche(Coche coche) {
//        this.coche = coche;
//    }
//
//    public void setNplaza(int nplaza) {
//        this.nplaza = nplaza;
//    }
//
//    public boolean isLibre() {
//        return libre;
//    }
//
//    public Coche getCoche() {
//        return coche;
//    }
//
//    public int getNplaza() {
//        return nplaza;
//    }
//    
    public void aparcar(Vehiculo vehiculo) throws BadVehiculoAparcadoException, FurgonetaDeMayorLongitudException{
        if (!libre) {
            System.out.println("La plaza " + nplaza + " está ocupada.");
        }
        
        switch (vehiculo.getTipoVehiculo().toUpperCase()) {
            case "COCHE":
                switch (tipoPlaza.toUpperCase()) {
                    case "COCHE":
                        this.vehiculo = vehiculo;
                        this.fechaEntrada = LocalDateTime.now();
                        this.libre = false;
                        System.out.println("Coche aparcado en la plaza " + nplaza + " a las " + fechaEntrada);
                        break;
                    case "MOTO":
                        throw new BadVehiculoAparcadoException("No se puede aparcar un coche en un parking de moto");
                    case "FURGONETA":
                        this.vehiculo = vehiculo;
                        this.fechaEntrada = LocalDateTime.now();
                        this.libre = false;
                        this.tarifaHora = tarifaHora * 2;
                        System.out.println("Coche aparcado en la plaza " + nplaza + " a las " + fechaEntrada);
                        System.out.println("HAS APARCADO UNA PLAZA DE FURGONETA POR LO QUE SE TE VA A APLICAR TARIFA SUPERIOR");
                        break;
                }
            case "MOTO":
                switch (tipoPlaza.toUpperCase()) {
                    case "COCHE":
                        this.vehiculo = vehiculo;
                        this.fechaEntrada = LocalDateTime.now();
                        this.libre = false;
                        this.tarifaHora = tarifaHora * 2;
                        System.out.println("Coche aparcado en la plaza " + nplaza + " a las " + fechaEntrada);
                        System.out.println("HAS APARCADO UNA PLAZA DE COCHE POR LO QUE SE TE VA A APLICAR TARIFA SUPERIOR");
                        break;
                    case "MOTO":
                        this.vehiculo = vehiculo;
                        this.fechaEntrada = LocalDateTime.now();
                        this.libre = false;
                        System.out.println("Moto aparcado en la plaza " + nplaza + " a las " + fechaEntrada);
                    case "FURGONETA":
                        this.vehiculo = vehiculo;
                        this.fechaEntrada = LocalDateTime.now();
                        this.libre = false;
                        this.tarifaHora = tarifaHora * 3;
                        System.out.println("Moto aparcado en la plaza " + nplaza + " a las " + fechaEntrada);
                        System.out.println("HAS APARCADO UNA PLAZA DE FURGONETA POR LO QUE SE TE VA A APLICAR TARIFA SUPERIOR");
                        break;
                }
            case "FURGONETA":
                switch (tipoPlaza.toUpperCase()) {
                    case "COCHE":
                        throw new BadVehiculoAparcadoException("No se puede aparcar una furgoneta en un parking de coche");

                    case "MOTO":
                        throw new BadVehiculoAparcadoException("No se puede aparcar una furgoneta en un parking de moto");
                    case "FURGONETA":
                        if (vehiculo instanceof Furgoneta) {
                            Furgoneta furgoneta = (Furgoneta) vehiculo;
                            if (furgoneta.getLongitud() > longitudMaxima) {
                                throw new FurgonetaDeMayorLongitudException("Lo siento, pero tu furgoneta supera las longitudes del parking, por lo que no puedes aparcar aqui.");
                            } else {
                                this.vehiculo = vehiculo;
                                this.fechaEntrada = LocalDateTime.now();
                                this.libre = false;
                                System.out.println("Furgoneta aparcada en la plaza " + nplaza + " a las " + fechaEntrada);
                            }
                        }
        }
        
        

        
    }


    }
}
