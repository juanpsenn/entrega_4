/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionFacturacion;

import GestionInstalacion.Lectura;

/**
 *
 * @author john
 */
public class IteradorLectura implements IIterador {
    
    private GestionInstalacion.Lectura elementos[];
    private int posicion;

    public IteradorLectura(Lectura[] elementos, int posicion) {
        this.elementos = elementos;
        this.posicion = posicion;
    }

    public Lectura[] getElementos() {
        return elementos;
    }

    public void setElementos(Lectura[] elementos) {
        this.elementos = elementos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
            
    @Override
    public void first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object current() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
