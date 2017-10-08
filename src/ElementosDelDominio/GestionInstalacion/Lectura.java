/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElementosDelDominio.GestionInstalacion;

import ElementosDelDominio.Facturacion.Factura;

/**
 *
 * @author mickaelacrespo
 */
public class Lectura {
    
    private float estimada;
    private String fechaHoraLectura;
    private float valorCorregido;
    private float valorLectura;
    private Estado estado;
    private Factura factura;

    public Lectura(float estimada, String fechaHoraLectura, float valorCorregido, float valorLectura, Estado estado, Factura factura) {
        this.estimada = estimada;
        this.fechaHoraLectura = fechaHoraLectura;
        this.valorCorregido = valorCorregido;
        this.valorLectura = valorLectura;
        this.estado = estado;
        this.factura = factura;
    }

    public float getEstimada() {
        return estimada;
    }

    public String getFechaHoraLectura() {
        return fechaHoraLectura;
    }

    public float getValorCorregido() {
        return valorCorregido;
    }

    public float getValorLectura() {
        return valorLectura;
    }

    public Estado getEstado() {
        return estado;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setEstimada(float estimada) {
        this.estimada = estimada;
    }

    public void setValorCorregido(float valorCorregido) {
        this.valorCorregido = valorCorregido;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
    
}
