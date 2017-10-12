/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionFacturacion;
import java.util.Date;

/**
 *
 * @author mickaelacrespo
 */
public class Factura {
    
    
    private long diasDeLecturaFacturados;
    private Date fechaFacturacion;
    private float m3Consumidos;
    private String nroFactura;
    private PeriodoFacturacion periodoFacturacion;
    private DetalleConceptoFacturado detalles[];
    private float total;

    public Factura(long diasDeLectura,float consumoFacturado,String nroFactura,PeriodoFacturacion periodoActual,float totalFacturacion,Object[][] conceptosFacturados, Object[][] impuestos) {
        this.diasDeLecturaFacturados = diasDeLectura;
        this.fechaFacturacion = new Date();
        this.m3Consumidos = consumoFacturado;
        this.nroFactura = nroFactura;
        this.periodoFacturacion = periodoActual;
        this.total = totalFacturacion;
        
        int d = conceptosFacturados.length + impuestos.length;
        detalles = new DetalleConceptoFacturado[d];
        int usado = 0;
        for (int i = 0; i < conceptosFacturados.length; i++) {
            if (conceptosFacturados[0][i] != null) {
                usado++;
                String nombre = (String) conceptosFacturados[0][i];
                int monto = (int) conceptosFacturados[1][i];
                detalles[i] = new DetalleConceptoFacturado(monto,nombre);
            }  
        }
        
                for (int i = usado; i < impuestos.length + usado; i++) {
            if (impuestos[0][i] != null) {
                String nombre = (String) impuestos[0][i];
                int monto = (int) impuestos[1][i];
                detalles[i] = new DetalleConceptoFacturado(monto,nombre);
            }  
        }
        
        
    }

    public long getDiasDeLecturaFacturados() {
        return diasDeLecturaFacturados;
    }

    public void setDiasDeLecturaFacturados(int diasDeLecturaFacturados) {
        this.diasDeLecturaFacturados = diasDeLecturaFacturados;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public float getM3Consumidos() {
        return m3Consumidos;
    }

    public void setM3Consumidos(int m3Consumidos) {
        this.m3Consumidos = m3Consumidos;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
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
