/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionServicio;

/**
 *
 * @author mickaelacrespo
 */
public class Categoria {

    private int m3BasicosDesde;
    private int m3BasicosHasta;
    private int montoBasico;
    private String nombre;

    public Categoria(int m3BasicosDesde, int m3BasicosHasta, int montoBasico, String nombre) {
        this.m3BasicosDesde = m3BasicosDesde;
        this.m3BasicosHasta = m3BasicosHasta;
        this.montoBasico = montoBasico;
        this.nombre = nombre;
    }

    
    
    public int getM3BasicosDesde() {
        return m3BasicosDesde;
    }

    public int getM3BasicosHasta() {
        return m3BasicosHasta;
    }

    public int getMontoBasico() {
        return montoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setM3BasicosDesde(int m3BasicosDesde) {
        this.m3BasicosDesde = m3BasicosDesde;
    }

    public void setM3BasicosHasta(int m3BasicosHasta) {
        this.m3BasicosHasta = m3BasicosHasta;
    }

    public void setMontoBasico(int montoBasico) {
        this.montoBasico = montoBasico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getM3Basico() {
        return (m3BasicosHasta - m3BasicosDesde);
    }

}
