/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Enums.TipoVehiculo;

/**
 *
 * @author itsmi
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private int nroMotor;
    private String chasis;
    private String color;
    private TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, int nroMotor, String chasis, String color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nroMotor = nroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(int nroMotor) {
        this.nroMotor = nroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", nroMotor=" + nroMotor + 
                ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
}
