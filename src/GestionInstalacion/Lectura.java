/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionInstalacion;

import GestionFacturacion.Factura;
import GestionFacturacion.PeriodoFacturacion;
import java.util.Date;

/**
 *
 * @author mickaelacrespo
 */
public class Lectura {

    private float estimada;
    private Date fechaHoraLectura;
    private float valorCorregido;
    private float valorLectura;
    private Estado estado;
    private Factura factura;
    //Atributos que estan debido a que no hay base de datos
    private Medidor medidor;

    public Lectura(Date fechaHoraLectura, float valorLectura, Estado estado) {
        this.fechaHoraLectura = fechaHoraLectura;
        this.valorCorregido = valorLectura;
        this.valorLectura = valorLectura;
        this.estado = estado;
    }

    public void setMedidor(Medidor medidor) {
        this.medidor = medidor;
    }
    
    

    public float getEstimada() {
        return estimada;
    }

    public void setEstimada(float estimada) {
        this.estimada = estimada;
    }

    public Date getFechaHoraLectura() {
        return fechaHoraLectura;
    }

    public void setFechaHoraLectura(Date fechaHoraLectura) {
        this.fechaHoraLectura = fechaHoraLectura;
    }

    public float getValorCorregido() {
        return valorCorregido;
    }

    public void setValorCorregido(float valorCorregido) {
        this.valorCorregido = valorCorregido;
    }

    public float getValorLectura() {
        return valorLectura;
    }

    public void setValorLectura(float valorLectura) {
        this.valorLectura = valorLectura;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Object[] buscarDatosPropiedad() {
        return medidor.buscarDatosPropiedad();
    }

    public Object[] buscarDatosCliente() {
        return medidor.buscarDatosCliente();
    }

    //Implementar al final
    public void generarFactura() {
    }

    
    
    public void actualizarEstado(String nombre) {
        this.estado.setNombre(nombre);
        this.estado.setAmbito("Lectura");
    }
    
    public Factura generarFactura(long diasDeLectura,float consumoFacturado,String nroFactura,PeriodoFacturacion periodoActual,float totalFacturacion,Object[][] conceptosFacturados, Object[][] impuestos) {
        Factura factura = new Factura(diasDeLectura,consumoFacturado,nroFactura,periodoActual,totalFacturacion,conceptosFacturados,impuestos);
        return factura;
    }
            

}
