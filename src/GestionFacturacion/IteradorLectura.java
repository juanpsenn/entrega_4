/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionFacturacion;

import GestionInstalacion.Lectura;
import java.util.Date;

/**
 *
 * @author john
 */
public class IteradorLectura implements IIterador {

    private GestionInstalacion.Lectura elementos[];
    private int posicion;

    public IteradorLectura(Lectura[] elementos) {
//        int n = elementos.length;
//        this.elementos = new Lectura[n];
        this.elementos = elementos;
        this.posicion = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    @Override
    public void first() {
        this.posicion = 0;
    }

    @Override
    public void next() {
        this.posicion++;
    }

    @Override
    public boolean hasNext() {
        if (elementos[posicion++] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object current() {
        return elementos[posicion];
    }

    public Date getFechaHoraLectura(int i) {
        return elementos[i].getFechaHoraLectura();
    }

    public boolean cumpleFiltros(Lectura actual, Lectura siguiente, Lectura lecturaActual) {
        if (actual.getFechaHoraLectura().before(siguiente.getFechaHoraLectura()) || actual.getFechaHoraLectura().equals(lecturaActual.getFechaHoraLectura())) {
            return false;
        } else {
            return true;
        }

    }
}
