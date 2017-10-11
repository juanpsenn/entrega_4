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
public class DomicilioFacturacion {
    
    private String calle;
    private String departamento;
    private String fechaFinVigencia;
    private String fechaInicioVigencia ;
    private int numero; 
    private int piso;

    public DomicilioFacturacion(String calle, String departamento, String fechaInicioVigencia, int numero, int piso) {
        this.calle = calle;
        this.departamento = departamento;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.numero = numero;
        this.piso = piso;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(String fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public String getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(String fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
 
}
