/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionFacturacion;

/**
 *
 * @author john
 */
public interface IIterador {
    
    public void first();
    
    public void next();
    
    public boolean hasNext();
    
    public Object current();
    
}
