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
public class CondicionTributaria {
    
    private String nombre;
    private float porcentajeImpuestoAplicable;

    public CondicionTributaria(String nombre, float porcentajeImpuestoAplicable) {
        this.nombre = nombre;
        this.porcentajeImpuestoAplicable = porcentajeImpuestoAplicable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPorcentajeImpuestoAplicable() {
        return porcentajeImpuestoAplicable;
    }

    public void setPorcentajeImpuestoAplicable(float porcentajeImpuestoAplicable) {
        this.porcentajeImpuestoAplicable = porcentajeImpuestoAplicable;
    }
    
    
}
