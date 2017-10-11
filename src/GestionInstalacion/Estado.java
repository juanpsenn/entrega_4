/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionInstalacion;

/**
 *
 * @author mickaelacrespo
 */
public class Estado {

    public String ambito;
    public String nombre;

    public Estado(String ambito, String nombre) {
        this.ambito = ambito;
        this.nombre = nombre;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esCorregidaFacturada() {
        return ("Corregida facturada".equals(nombre));
    }

    public boolean esFacturadaSinControl() {
        return ("Facturada sin control".equals(nombre));
    }

    public boolean esAmbitoLectura() {
        return ("Lectura".equals(ambito));
    }

}
