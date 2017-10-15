/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionPropiedades;

import GestionInstalacion.Impuesto;

/**
 *
 * @author mickaelacrespo
 */
public class Localidad {

    private String nombre;
    private Zona zonas[];
    private Impuesto impuestosDeLocalidad[];

    public Localidad(String nombre, Zona[] zonas, Impuesto[] impuestosDeLocalidad) {
        this.nombre = nombre;
        this.zonas = zonas;
        this.impuestosDeLocalidad = impuestosDeLocalidad;
    }
    
    

    public Object[][] buscarImpuestos(String condicionTributaria) {
        Object[][] valores = new Object[2][impuestosDeLocalidad.length];

        for (int i = 0; i < impuestosDeLocalidad.length; i++) {
            Impuesto im = (Impuesto) impuestosDeLocalidad[i];
            if (im.tieneCondicionTributaria() == false) {
                valores[i][0] = im.getNombre();
                valores[i][1] = im.getMontoFijo();

            } else if (im.esCondicionTributariaCliente(condicionTributaria) == true) {
                valores[i][0] = im.getNombre();
                valores[i][1] = im.getMontoFijo();
            }

        }
        return valores;
    }
}
