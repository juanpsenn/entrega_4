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
    private Propiedad propiedad;
    private int nroIDCatastral;
    private float valorLecturaActual;
    private float montoBasico;
    private float m3Basico;

    public void generarFacturacionInSitu(PeriodoFacturacion[] pf, Propiedad p) {
        getPeriodoActual(pf);
        buscarDatosPropiedad();
        buscarDatosCliente();
        buscarLecturaAnterior();
        buscarDatosLecturaActual();
        calcularConsumoFacturado();
        buscarMontoBasico(p);
        calcularDiasDeLectura();
        verificarCalculoExcedente();
        verificarBonificaciones();
        buscarImpuestos();
        calcularConecptosDeFacturacion();
        calcularTotalFactura();
        generarFactura();
        imprimirFactura();
        finCU();

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
        Object[] n = lecturaActual.buscarDatosPropiedad();
        nroIDCatastral = (Integer) n[0];
        propiedad = (Propiedad) n[1];

    }

    private void buscarDatosCliente() {

    }

    private void buscarLecturaAnterior() {

    }

    private void buscarDatosLecturaActual() {
        valorLecturaActual = lecturaActual.getValorCorregido();
    }

    private void calcularConsumoFacturado() {

    }

    private void calcularDiasDeLectura() {

    }

    private void buscarMontoBasico(Propiedad p) {
        float[] n = new float[2];

        n = p.buscarMontosBasicos();
        m3Basico = n[0];
        montoBasico = n[1];

    }

    private void verificarCalculoExcedente() {

    }

    private void verificarBonificaciones() {

    }

    private void buscarImpuestos() {

    }

    private void calcularConecptosDeFacturacion() {

    }

    private void calcularTotalFactura() {

    }

    private void generarFactura() {

    }

    private void imprimirFactura() {

    }

    private void finCU() {

    }

}
