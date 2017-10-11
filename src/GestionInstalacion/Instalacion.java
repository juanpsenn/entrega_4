/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionInstalacion;

import GestionInstalacion.Medidor;
import GestionPropiedades.Propiedad;

/**
 *
 * @author mickaelacrespo
 */
public class Instalacion {

    private String fechaInstalacion;
    private String fechaRetiro;
    private int nroOrdenInstalacion;
    private Medidor medidores[];
    //Atributos que estan solo porque no hay base de datos
    private Propiedad propiedad;

    public Instalacion(String fechaInstalacion, String fechaRetiro, int nroOrdenInstalacion, Medidor[] medidores) {
        this.fechaInstalacion = fechaInstalacion;
        this.fechaRetiro = fechaRetiro;
        this.nroOrdenInstalacion = nroOrdenInstalacion;
        this.medidores = medidores;
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(String fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public int getNroOrdenInstalacion() {
        return nroOrdenInstalacion;
    }

    public void setNroOrdenInstalacion(int nroOrdenInstalacion) {
        this.nroOrdenInstalacion = nroOrdenInstalacion;
    }

    public Medidor[] getMedidores() {
        return medidores;
    }

    public void setMedidores(Medidor[] medidores) {
        this.medidores = medidores;
    }

    public Object[] buscarDatosPropiedad() {
        Object[] n = new Object[2];
        n[0] = propiedad.getNroIdentificacionCatastral();
        n[1] = propiedad;

        return n;
    }

}
