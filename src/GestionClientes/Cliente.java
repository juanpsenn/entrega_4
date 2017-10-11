/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionClientes;

/**
 *
 * @author mickaelacrespo
 */
public class Cliente {
   
    private String nombre;
    private String apellido;
    private double dni;
    private double nro;    
    private String fechaActualizacion;
    private CondicionTributaria condicionTributaria;
    private DomicilioFacturacion domicilioFacturacion;

    public Cliente(String nombre, String apellido, double dni, double nro, String fechaActualizacion, CondicionTributaria condicionTributaria, DomicilioFacturacion domicilioFacturacion) {
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

    public void setDni(double dni) {
        this.dni = dni;
    }

    public double getNroCliente() {
        return nro;
    }

    public void setNroCliente(double nro) {
        this.nro = nro;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
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
