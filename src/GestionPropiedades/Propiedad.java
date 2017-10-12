/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionPropiedades;

import GestionInstalacion.Instalacion;
import GestionInstalacion.Lectura;
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
    private Instalacion instalacion;
    //Atributos que estan debido a que no hay base de datos
    private Zona zona;

    public Propiedad(String calle, String departamento, int nroIdentificacionCatastral, int numero, int piso, Servicio servicio, Instalacion instalacion) {
        this.calle = calle;
        this.departamento = departamento;
        this.nroIdentificacionCatastral = nroIdentificacionCatastral;
        this.numero = numero;
        this.piso = piso;
        this.servicio = servicio;
        this.instalacion = instalacion;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public int getNroIdentificacionCatastral() {
        return nroIdentificacionCatastral;
    }

    public float[] buscarMontosBasicos() {
        return servicio.buscarMontosBasicos();
    }

    public Object[] buscarDatosClientes() {
        return servicio.buscarDatosCliente();
    }

    public Object[] buscarBonificaciones() {
        Object[] b;
        if (servicio.tieneSolicitudesVigentesYAprobadas() == true) {
            b = servicio.getSolicitudesBonificacion();
            return b;
        }

        b = new Object[1];
        return b;
    }

    public Object[][] buscarImpuestos(String condicionTributaria) {
        return zona.buscarImpuestos(condicionTributaria);
    }

    public Lectura buscarLecturaAnterior(Lectura lecturaActual) {
        return instalacion.buscarLecturaAnterior(lecturaActual);
    }
}
