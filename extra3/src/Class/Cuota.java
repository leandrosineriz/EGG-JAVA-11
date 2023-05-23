/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Enums.TipoPago;
import java.util.Date;

/**
 *
 * @author itsmi
 */
public class Cuota {
    private int id;
    private float montoTotal;
    private boolean pago;
    private Date fechaVenc;
    private TipoPago formaPago;

    public Cuota() {
    }

    public Cuota(int id, float montoTotal, Date fechaVenc, TipoPago formaPago) {
        this.id = id;
        this.montoTotal = montoTotal;
        this.pago = false;
        this.fechaVenc = fechaVenc;
        this.formaPago = formaPago;
    }

    public TipoPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(TipoPago formaPago) {
        this.formaPago = formaPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    @Override
    public String toString() {
        return "Cuota{" + "id=" + id + ", montoTotal=" + montoTotal + ", pago=" + pago + ", fechaVenc=" + fechaVenc + 
                ", formaPago=" + formaPago + '}';
    }
    
    
}
