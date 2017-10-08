/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElementosDelDominio.GestionServicio;

import ElementosDelDominio.GestionServicio.Categoria;

/**
 *
 * @author mickaelacrespo
 */
public class Servicio {
    
    private String fechaAlta;
    private String fechaDeSolicitud;
    private Categoria categoria;
    private SolicitudBonificacion solicitudes[];

    public String getFechaAlta() {
        return fechaAlta;
    }

    public String getFechaDeSolicitud() {
        return fechaDeSolicitud;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public SolicitudBonificacion[] getSolicitudes() {
        return solicitudes;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaDeSolicitud(String fechaDeSolicitud) {
        this.fechaDeSolicitud = fechaDeSolicitud;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setSolicitudes(SolicitudBonificacion[] solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
    
}
