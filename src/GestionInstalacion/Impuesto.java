/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionInstalacion;

import GestionClientes.CondicionTributaria;

/**
 *
 * @author mickaelacrespo
 */
public class Impuesto {
    
    private String nombre;
    private float montoFijo;
    private CondicionTributaria condicionTributaria;

    public Impuesto(String nombre, float montoFijo, CondicionTributaria condicionTributaria) {
        this.nombre = nombre;
        this.montoFijo = montoFijo;
        this.condicionTributaria = condicionTributaria;
    }

    public Impuesto(String nombre, float montoFijo) {
        this.nombre = nombre;
        this.montoFijo = montoFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(float montoFijo) {
        this.montoFijo = montoFijo;
    }

    public CondicionTributaria getCondicionTributaria() {
        return condicionTributaria;
    }

    public void setCondicionTributaria(CondicionTributaria condicionTributaria) {
        this.condicionTributaria = condicionTributaria;
    }
    
    public boolean tieneCondicionTributaria(){
        if (condicionTributaria == null) 
        {
            return false;
        }
        return true;
    }
    
    public boolean esCondicionTributariaCliente(String cT){
        String nombreCT = condicionTributaria.getNombre();
        if (nombreCT == cT){
            return true;
        }
        return false;
    }

}
