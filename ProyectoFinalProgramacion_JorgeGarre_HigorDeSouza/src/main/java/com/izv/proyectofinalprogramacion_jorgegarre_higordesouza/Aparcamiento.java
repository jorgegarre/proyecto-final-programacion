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
public class Aparcamiento  {

    // Para poder meter la tarifaHora segun el tipo de Vehiculo se puede hacer un hashamap (Vehiculo,tarifaHora)
    // y desde ahi hacerlo
    protected int nplaza;
    protected boolean libre;
    protected Vehiculo vehiculo;
    protected String tipoPlaza;
    protected double tarifaHora;
    protected double longitudMaxima = 7.0;
    protected final boolean plazaCargardorElectrico;
    protected LocalDateTime fechaEntrada;
    protected LocalDateTime fechaSalida;

    public Aparcamiento(boolean libre, Vehiculo vehiculo, int nplaza, String tipoPlaza, boolean plazaCargadorElectrico) throws BadTipoPlazaException, FurgonetaDeMayorLongitudException{
        this.libre = libre;
        this.vehiculo = vehiculo;
        this.nplaza = nplaza;
        setTipoPlaza(tipoPlaza);
        setTarifaHora();
        this.plazaCargardorElectrico = plazaCargadorElectrico;
    }

 
    private void setTarifaHora() {
        switch (tipoPlaza.toUpperCase()) {
            case "COCHE":
                tarifaHora = 1.7;
                break;
            case "MOTO":
                tarifaHora = 0.9;
                break;
            case "FURGONETA":
                tarifaHora = 2.3;
                break;
            default:
                tarifaHora = 0;
                break;
        }
    }
    

    public void setTipoPlaza(String tipoPlaza) throws BadTipoPlazaException {
        switch (tipoPlaza.toUpperCase()) {
            case "COCHE":
                this.tipoPlaza = tipoPlaza.toUpperCase();
            case "MOTO":
                this.tipoPlaza = tipoPlaza.toUpperCase();
            case "FURGONETA":
                this.tipoPlaza = tipoPlaza.toUpperCase();
            default:
                throw new BadTipoPlazaException("El tipo de plaza introducido no es válido, solo existen plazas de Coches, Motos o Furgonetas");
        }
    }
    

    public void aparcar(Vehiculo vehiculo) throws BadVehiculoAparcadoException, FurgonetaDeMayorLongitudException {
        if (!libre) {
            System.out.println("La plaza " + nplaza + " está ocupada.");
        }

        switch (vehiculo.getTipoVehiculo().toUpperCase()) {
            case "COCHE":
                switch (tipoPlaza.toUpperCase()) {
                    case "COCHE":
                        if(plazaCargardorElectrico) {
                            if(vehiculo instanceof Hibrido) {
                                this.vehiculo = vehiculo;
                                this.fechaEntrada = LocalDateTime.now();
                                this.libre = false;
                        System.out.println("Coche aparcado en la plaza " + nplaza + " a las " + fechaEntrada);
                            }
                        }
                        this.vehiculo = vehiculo;
                        this.fechaEntrada = LocalDateTime.now();
                        this.libre = false;
                        System.out.println("Coche aparcado en la plaza " + nplaza + " a las " + fechaEntrada);
                    case "MOTO":
                        throw new BadVehiculoAparcadoException("No se puede aparcar un coche en un parking de moto");
                    case "FURGONETA":
                        this.vehiculo = vehiculo;
                        this.fechaEntrada = LocalDateTime.now();
                        this.libre = false;
                        this.tarifaHora = tarifaHora * 2;
                        System.out.println("Coche aparcado en la plaza " + nplaza + " a las " + fechaEntrada);
                        System.out.println("HAS APARCADO UNA PLAZA DE FURGONETA POR LO QUE SE TE VA A APLICAR TARIFA SUPERIOR");
                        
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

    public void salir() {
        if (libre) {
            System.out.println("La plaza " + nplaza + " ya está libre.");
            return;
        }

        this.fechaSalida = LocalDateTime.now();
        this.libre = true;
        System.out.println(vehiculo + " salió de la plaza " + nplaza + " a las " + fechaSalida);
        this.vehiculo = null;
    }
}
