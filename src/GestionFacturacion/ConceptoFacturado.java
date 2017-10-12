package GestionFacturacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mickaelacrespo
 */
public class ConceptoFacturado {
    
    private String nombre;
    private float costo;

    public ConceptoFacturado(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }
 
    
    
}
