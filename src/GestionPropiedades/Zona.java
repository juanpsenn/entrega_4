/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionPropiedades;

/**
 *
 * @author mickaelacrespo
 */
public class Zona {
    
    private String nombre;
    private Propiedad propiedades[];
        //Atributos que estan debido a que no hay base de datos
    private Localidad localidad;
    
    
    public Object[][] buscarImpuestos(String condicionTributaria) {
        return localidad.buscarImpuestos(condicionTributaria);
    }    
}
