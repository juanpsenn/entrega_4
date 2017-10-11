/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionPropiedades;

import GestionServicio.Servicio;

/**
 *
 * @author mickaelacrespo
 */
public class Propiedad {

    private String calle;
    private String departamento;
    private int nroIdentificacionCatastral;
    private int numero;
    private int piso;
    private Servicio servicio;

    public int getNroIdentificacionCatastral() {
        return nroIdentificacionCatastral;
    }

    public float[] buscarMontosBasicos() {
        return servicio.buscarMontosBasicos();
    }
    
    public Object[] buscarDatosClientes() {
        return servicio.buscarDatosCliente();
    }
}
