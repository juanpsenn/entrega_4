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

    public String getDepartamento() {
        return departamento;
    }

    public String getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public String getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setFechaFinVigencia(String fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }
    
    
    
    
}
