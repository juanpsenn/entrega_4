package ElementosDeAnalisis;

import java.util.Date;
import GestionFacturacion.PeriodoFacturacion;
import GestionPropiedades.Propiedad;
import GestionInstalacion.Lectura;
import static java.lang.Math.round;

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
    //Lecturas
    private Lectura lecturaActual;
    private float valorLecturaActual;
    private Lectura lecturaAnterior;
    private long diasDeLectura;
    //Propieda
    private Propiedad propiedad;
    private int nroIDCatastral;
    private float montoBasico;
    private float m3Basico;
    //Datos cliente
    private String nombreCliente;
    private String apellidoCliente;
    private long nroCliente;
    private String condicionTributariaCliente;
    private String domicilioFacturacionCliente;
    //Datos de la facturacion
    private Object[] solicitudes;
    private Object[] impuestos;

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
        Object[] temp = lecturaActual.buscarDatosCliente();
        this.nroCliente = (long) temp[0];
        this.apellidoCliente = (String) temp[1];
        this.nombreCliente = (String) temp[2];
        this.domicilioFacturacionCliente = (String) temp[3];
        this.condicionTributariaCliente = (String) temp[4];
    }

    private void buscarLecturaAnterior() {
        lecturaAnterior = propiedad.buscarLecturaAnterior(lecturaActual);
    }

    private void buscarDatosLecturaActual() {
        valorLecturaActual = lecturaActual.getValorCorregido();
    }

    
    private void calcularConsumoFacturado() {

    }

    private void calcularDiasDeLectura() {
        Date fechaLecturaActual = lecturaActual.getFechaHoraLectura();
        Date fechaLecturaAnterior = lecturaAnterior.getFechaHoraLectura();
        double diff = fechaLecturaActual.getTime() - fechaLecturaAnterior.getTime();
        long days = round((diff / (60*60*24*1000)));
        
        diasDeLectura = days;
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
        Object[] sol = propiedad.buscarBonificaciones();
        if (sol.length != 0) {
            solicitudes = sol;
        }
    }

    private void buscarImpuestos() {
        impuestos = propiedad.buscarImpuestos(condicionTributariaCliente);
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
