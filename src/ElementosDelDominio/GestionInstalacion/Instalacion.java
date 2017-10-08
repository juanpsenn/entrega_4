/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElementosDelDominio.GestionInstalacion;

import ElementosDelDominio.GestionInstalacion.Medidor;

/**
 *
 * @author mickaelacrespo
 */
public class Instalacion {

    private String fechaInstalacion;
    private String fechaRetiro;
    private int nroOrdenInstalacion;
    private Medidor medidores[];
    

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public int getNroOrdenInstalacion() {
        return nroOrdenInstalacion;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    
    
    
}
