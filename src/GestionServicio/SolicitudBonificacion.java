package GestionServicio;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mickaelacrespo
 */
public class SolicitudBonificacion {

    private Date fechaAprobacion;
    private Date fechaFinVigencia;
    private Date fechaRechazo;
    private Date fechaSolicitud;


    public SolicitudBonificacion(Date fechaSolicitud, Date fechaAprobacion, Date fechaFinVigencia) {
        this.fechaAprobacion = fechaAprobacion;
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaSolicitud = fechaSolicitud;
    }

    public SolicitudBonificacion(Date fechaSolicitud, Date fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
        this.fechaSolicitud = fechaSolicitud;
    }
    
    

    public boolean estaAprobada() {
        if (fechaAprobacion == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean estaVigente() {
        java.util.Date fechaActual = new Date();
        if (fechaActual.before(fechaFinVigencia)) {
            return true;
        } else {
            return false;
        }
    }

    // falta metodo esta vigente, se tiene que hacer con la fecha actual.
    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public void setFechaRechazo(Date fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

}
