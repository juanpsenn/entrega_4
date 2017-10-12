package ElementosDeAnalisis;

import GestionFacturacion.ConceptoFacturado;
import GestionFacturacion.Factura;
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
    private ConceptoFacturado[] conceptos;
    //Lecturas
    private Lectura lecturaActual;
    private float valorLecturaActual;
    private Lectura lecturaAnterior;
    private long diasDeLectura;
    //Propiedad
    private Propiedad propiedad;
    private int nroIDCatastral;
    private float m3Basico;
    //Datos cliente
    private String nombreCliente;
    private String apellidoCliente;
    private long nroCliente;
    private String condicionTributariaCliente;
    private String domicilioFacturacionCliente;
    //Datos de la facturacion
    private Object[] solicitudes;
    private Object[][] impuestos;
    private float consumoFacturado;
    private float montoBasico;
    private Object[][] conceptosFacturados;
    private float totalFacturacion;
    private Factura factura;

    public void generarFacturacionInSitu(PeriodoFacturacion[] pf, Propiedad p, String nroF) {
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
        calcularConceptosDeFacturacion();
        calcularTotalFactura();
//        Agregar llamadas a metodos 56 y 57
        generarFactura(nroF);
//        imprimirFactura(); No es necesario para la materia.
        finCU();

    }

    public GestorFacturacionInSitu(ConceptoFacturado[] conceptos, Lectura lecturaActual) {
        this.conceptos = conceptos;
        this.lecturaActual = lecturaActual;
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
        consumoFacturado = valorLecturaActual - lecturaAnterior.getValorCorregido();
    }

    private void calcularDiasDeLectura() {
        Date fechaLecturaActual = lecturaActual.getFechaHoraLectura();
        Date fechaLecturaAnterior = lecturaAnterior.getFechaHoraLectura();
        double diff = fechaLecturaActual.getTime() - fechaLecturaAnterior.getTime();
        long days = round((diff / (60 * 60 * 24 * 1000)));

        diasDeLectura = days;
    }

    private void buscarMontoBasico(Propiedad p) {
        float[] n = new float[2];

        n = p.buscarMontosBasicos();
        m3Basico = n[0];
        montoBasico = n[1];

    }

    private boolean verificarCalculoExcedente() {
        if (consumoFacturado > m3Basico) {
            return true;
        } else {
            return false;
        }
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

    private void calcularConceptosDeFacturacion() {
        Object[][] c = new Object[2][conceptos.length];
        c[0][0] = "Basico Propiedad";
        c[1][0] = montoBasico;
        for (int i = 1; i < conceptos.length - 1; i++) {
            if (0 != conceptos[i].getCosto()) {
                c[0][i] = conceptos[i].getNombre();
                c[1][i] = conceptos[i].getCosto();
            }
        }
        conceptosFacturados = c;

    }

    private void calcularTotalFactura() {
        float total = 0;
        for (int i = 0; i < conceptosFacturados.length; i++) {
            if (conceptosFacturados[1][i] != null) {
                total += (float) conceptosFacturados[1][i];
            }
        }
        for (int i = 0; i < impuestos.length; i++) {
            if (impuestos[1][i] != null) {
                total += (float) impuestos[1][i];
            }
        }
        totalFacturacion = total;

    }

    private void generarFactura(String nroFactura) {
        factura = lecturaActual.generarFactura(diasDeLectura, consumoFacturado, nroFactura, periodoActual, totalFacturacion, conceptosFacturados, impuestos);

    }

//    private void imprimirFactura() {
//
//    }

    private void finCU() {

    }

}
