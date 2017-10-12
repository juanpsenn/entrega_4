/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionClientes;

import java.util.Date;

/**
 *
 * @author mickaelacrespo
 */
public class Cliente {
   
    private String nombre;
    private String apellido;
    private long dni;
    private long nro;    
    private Date fechaActualizacion;
    private CondicionTributaria condicionTributaria;
    private DomicilioFacturacion domicilioFacturacion;

    public Cliente(String nombre, String apellido, long dni, long nro, Date fechaActualizacion, CondicionTributaria condicionTributaria, DomicilioFacturacion domicilioFacturacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nro = nro;
        this.fechaActualizacion = fechaActualizacion;
        this.condicionTributaria = condicionTributaria;
        this.domicilioFacturacion = domicilioFacturacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getNroCliente() {
        return nro;
    }

    public void setNroCliente(long nro) {
        this.nro = nro;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public CondicionTributaria getCondicionTributaria() {
        return condicionTributaria;
    }

    public void setCondicionTributaria(CondicionTributaria condicionTributaria) {
        this.condicionTributaria = condicionTributaria;
    }

    public String getDomicilioFacturacion() {
        String ret = "";
        ret += domicilioFacturacion.getDepartamento();
        ret += ", " + domicilioFacturacion.getCalle();
        ret += " " + domicilioFacturacion.getNumero();
        ret += ", Piso " + domicilioFacturacion.getPiso() + ".";
        return ret;
    }

    public void setDomicilioFacturacion(DomicilioFacturacion domicilioFacturacion) {
        this.domicilioFacturacion = domicilioFacturacion;
    }
    
    public String buscarCondicionTributaria () {
        return this.condicionTributaria.getNombre();
        
    }
}
