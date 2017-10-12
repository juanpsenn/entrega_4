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
            if (impuestosDeLocalidad[i].tieneCondicionTributaria() == false) {
                valores[0][i] = impuestosDeLocalidad[i].getNombre();
                valores[1][i] = impuestosDeLocalidad[i].getMontoFijo();

            } else if (impuestosDeLocalidad[i].esCondicionTributariaCliente(condicionTributaria) == true) {
                valores[0][i] = impuestosDeLocalidad[i].getNombre();
                valores[1][i] = impuestosDeLocalidad[i].getMontoFijo();
            }

        }
        return valores;
    }
}
