/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionServicio;

import java.util.Date;
import GestionServicio.Categoria;
import GestionClientes.Cliente;
import java.util.ArrayList;

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

    public ArrayList buscarDatosCliente(Cliente c) {
        ArrayList al = New Object[0];

        al.add(Cliente.getNro());
        al.add(Cliente.getApellido());
        al.add(Cliente.getNombre());
        al.add(Cliente.getDomicilioFacturacion());
        al.add(Cliente.buscarCondicionTributaria());

        return al;
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
