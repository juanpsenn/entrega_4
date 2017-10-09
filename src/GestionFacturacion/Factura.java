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

    public int getDiasDeLecturaFacturados() {
        return diasDeLecturaFacturados;
    }

    public String getFechaFacturacion() {
        return fechaFacturacion;
    }

    public int getM3Consumidos() {
        return m3Consumidos;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public int getNumero() {
        return numero;
    }

    public PeriodoFacturacion getPeriodoFacturacion() {
        return periodoFacturacion;
    }

    public DetalleConceptoFacturado[] getDetalles() {
        return detalles;
    }
    
    
    
    
}
