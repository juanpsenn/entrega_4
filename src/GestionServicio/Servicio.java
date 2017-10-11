/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionServicio;

import java.util.Date;
import GestionClientes.Cliente;

/**
 *
 * @author mickaelacrespo
 */
public class Servicio {

    private Date fechaAlta;
    private Date fechaDeSolicitud;
    private Categoria categoria;
    private SolicitudBonificacion solicitudes[];
    private Date fechaBaja;
    //Atributos que estan solo porque no hay base de datos
    private Cliente cliente;

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setSolicitudes(SolicitudBonificacion[] solicitudes) {
        this.solicitudes = solicitudes;
    }

    public boolean esActual() {
        if (fechaBaja == null) {
            return true;
        } else {
            return false;
        }
    }

    public Object[] buscarDatosCliente() {
        Object[] n = new Object[5];

        n[0] = cliente.getNroCliente();
        n[1] = cliente.getApellido();
        n[2] = cliente.getNombre();
        n[3] = cliente.getDomicilioFacturacion();
        n[4] = cliente.buscarCondicionTributaria();

        return n;
    }

    public float[] buscarMontosBasicos() {
        float[] montos = new float[2];
        montos[0] = categoria.getM3Basico();
        montos[1] = categoria.getMontoBasico();

        return montos;
    }

    public boolean tieneSolicitudesVigentesYAprobadas() {
        for (int i = 0; i < solicitudes.length; i++) {
            if (solicitudes[i].estaAprobada() || solicitudes[i].estaVigente()) {
                return true;
            }
        }
        return false;
    }

}
