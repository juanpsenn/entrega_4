/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElementosDelDominio.Facturacion;

/**
 *
 * @author mickaelacrespo
 */
public class DetalleConceptoFacturado {
    
    private int subtotal;
    private String motivoFacturacion;

    public int getSubtotal() {
        return subtotal;
    }

    public String getMotivoFacturacion() {
        return motivoFacturacion;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public void setMotivoFacturacion(String motivoFacturacion) {
        this.motivoFacturacion = motivoFacturacion;
    }
    
    
}
