/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Enums.TipoCobertura;
import Enums.TipoFormaPago;
import java.util.Date;

/**
 *
 * @author itsmi
 */
public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int id;
    private Date fechaIni;
    private Date fechaFin;
    private Cuota cuota;
    private int cantCuotas;
    private TipoFormaPago formaPago;
    private float montoTotalAsegurado;
    private boolean contraGranizo;
    private float montoMaxGranizo;
    private TipoCobertura tipoCobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, int id, Date fechaIni, Date fechaFin, Cuota cuota, 
            int cantCuotas, TipoFormaPago formaPago, float montoTotalAsegurado, boolean contraGranizo, 
            float montoMaxGranizo, TipoCobertura tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.id = id;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cuota = cuota;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.contraGranizo = contraGranizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public TipoFormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(TipoFormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public float getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(float montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isContraGranizo() {
        return contraGranizo;
    }

    public void setContraGranizo(boolean contraGranizo) {
        this.contraGranizo = contraGranizo;
    }

    public float getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(float montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", id=" + id + ", fechaIni=" + 
                fechaIni + ", fechaFin=" + fechaFin + ", cuota=" + cuota + ", cantCuotas=" + cantCuotas + 
                ", formaPago=" + formaPago + ", montoTotalAsegurado=" + montoTotalAsegurado + 
                ", contraGranizo=" + contraGranizo + ", montoMaxGranizo=" + montoMaxGranizo + 
                ", tipoCobertura=" + tipoCobertura + '}';
    }
    
    
}
