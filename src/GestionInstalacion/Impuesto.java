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
    private int montoFijo;
    private CondicionTributaria condicionTributaria;

    public Impuesto(String nombre, int montoFijo, CondicionTributaria condicionTributaria) {
        this.nombre = nombre;
        this.montoFijo = montoFijo;
        this.condicionTributaria = condicionTributaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(int montoFijo) {
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
