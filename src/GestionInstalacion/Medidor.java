/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionInstalacion;

import GestionFacturacion.IIterador;
import GestionFacturacion.IteradorLectura;

/**
 *
 * @author mickaelacrespo
 */
public class Medidor implements GestionFacturacion.IAgregado {

    private int numero;
    private Lectura lecturas[];
    //Atributos que estan solo porque no hay base de datos
    private Instalacion instalacion;

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
        IteradorLectura il = new IteradorLectura(lecturas);
        return il;
    }

    public Object[] buscarDatosPropiedad() {
        return instalacion.buscarDatosPropiedad();
    }

    public Object[] buscarDatosCliente() {
        return instalacion.buscarDatosCliente();
    }
}
