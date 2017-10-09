/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionInstalacion;

import GestionFacturacion.IIterador;



/**
 *
 * @author mickaelacrespo
 */
public class Medidor implements GestionFacturacion.IAgregado {
    
    private int numero;
    private Lectura lecturas[];    

    public Medidor(int numero, Lectura[] lecturas) {
        this.numero = numero;
        this.lecturas = lecturas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Lectura[] getLecturas() {
        return lecturas;
    }

    public void setLecturas(Lectura[] lecturas) {
        this.lecturas = lecturas;
    }

    @Override
    public IIterador crearIterador(Object[] elementos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
