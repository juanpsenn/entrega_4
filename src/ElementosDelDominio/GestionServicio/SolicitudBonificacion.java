package ElementosDelDominio.GestionServicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mickaelacrespo
 */
public class SolicitudBonificacion {
    
    private String fechaAprobacion;
    private String fechaFinVigencia;
    private String fechaRechazo;
    private String fechaSolicitud;
    
    public boolean estaAprobada(){
        if (fechaAprobacion == null){
            return false;
        }else return true;
    }
    
    // falta metodo esta vigente, se tiene que hacer con la fecha actual.
}
