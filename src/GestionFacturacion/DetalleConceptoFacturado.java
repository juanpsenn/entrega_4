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
public class DetalleConceptoFacturado {
    
    private int subtotal;
    private String nombre;

    public DetalleConceptoFacturado(int subtotal, String nombre) {
        this.subtotal = subtotal;
        this.nombre = nombre;
    }
    
    
    
}
