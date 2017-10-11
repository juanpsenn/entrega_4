/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionInstalacion;

import GestionFacturacion.IIterador;
import GestionFacturacion.IteradorLectura;
import java.util.Date;
/**
 *
 * @author mickaelacrespo
 */
public class Medidor implements GestionFacturacion.IAgregado {

    private int numero;
    private Lectura lecturas[];
    private Date fechaInstalacion;
    //Atributos que estan solo porque no hay base de datos
    private Instalacion instalacion;

    public Medidor(int numero, Lectura[] lecturas) {
        this.numero = numero;
        this.lecturas = lecturas;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
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

    public Lectura buscarLecturaAnterior(Lectura lecturaActual) {

        IteradorLectura iL = (IteradorLectura) crearIterador(lecturas);
        iL.first();
        Lectura actual = (Lectura) iL.current();
        for (int i = 1; i < lecturas.length - 1; i++) {
            if (iL.hasNext() == true) {
                Lectura anterior = (Lectura) iL.current();
                if (iL.cumpleFiltros(actual, anterior, lecturaActual)) {
                    actual = (Lectura) iL.current();
                }
                iL.next();
            }
        }
        return actual;

    }
}
