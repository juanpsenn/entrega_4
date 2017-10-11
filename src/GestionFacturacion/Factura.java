/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionFacturacion;

/**
 *
 * @author mickaelacrespo
 */
public class Factura {
    
    
    private int diasDeLecturaFacturados;
    private String fechaFacturacion;
    private int m3Consumidos;
    private int nroFactura;
    private int numero;
    private PeriodoFacturacion periodoFacturacion;
    private DetalleConceptoFacturado detalles[];

    public Factura(int diasDeLecturaFacturados, String fechaFacturacion, int m3Consumidos, int nroFactura, int numero, PeriodoFacturacion periodoFacturacion, DetalleConceptoFacturado[] detalles) {
        this.diasDeLecturaFacturados = diasDeLecturaFacturados;
        this.fechaFacturacion = fechaFacturacion;
        this.m3Consumidos = m3Consumidos;
        this.nroFactura = nroFactura;
        this.numero = numero;
        this.periodoFacturacion = periodoFacturacion;
        this.detalles = detalles;
    }

    public int getDiasDeLecturaFacturados() {
        return diasDeLecturaFacturados;
    }

    public void setDiasDeLecturaFacturados(int diasDeLecturaFacturados) {
        this.diasDeLecturaFacturados = diasDeLecturaFacturados;
    }

    public String getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(String fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public int getM3Consumidos() {
        return m3Consumidos;
    }

    public void setM3Consumidos(int m3Consumidos) {
        this.m3Consumidos = m3Consumidos;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public PeriodoFacturacion getPeriodoFacturacion() {
        return periodoFacturacion;
    }

    public void setPeriodoFacturacion(PeriodoFacturacion periodoFacturacion) {
        this.periodoFacturacion = periodoFacturacion;
    }

    public DetalleConceptoFacturado[] getDetalles() {
        return detalles;
    }

    public void setDetalles(DetalleConceptoFacturado[] detalles) {
        this.detalles = detalles;
    }

}
