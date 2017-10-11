package ElementosDeAnalisis;

import java.util.Date;
import GestionFacturacion.PeriodoFacturacion;
import GestionPropiedades.Propiedad;
import GestionInstalacion.Lectura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mickaelacrespo
 */
public class GestorFacturacionInSitu {

    private Date fechaActual;
    private PeriodoFacturacion periodoActual;
    private Lectura lecturaActual;

    public void generarFacturacionInSitu(PeriodoFacturacion[] pf) {
        getPeriodoActual(pf);
    }

//    Metodo sin sentido, durante la implementacion nos dimos cuenta que era innecesario
    private void getFechaActual() {
        fechaActual = new Date();
    }

    private void getPeriodoActual(PeriodoFacturacion[] pf) {
        Date fechaUltima = pf[0].getFechaHasta();
        PeriodoFacturacion periodoActual = pf[0];
        for (int i = 0; i < pf.length; i++) {
            Date fechaAComparar = pf[i].getFechaHasta();
            if (fechaAComparar.after(fechaUltima)) {
                fechaUltima = fechaAComparar;
                periodoActual = pf[i];
            }
        }
        this.periodoActual = periodoActual;
    }

    private void buscarDatosPropiedad() {

    }

}
