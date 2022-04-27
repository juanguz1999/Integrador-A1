/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author bruno
 */
public class Ejercicio {
    private int muestra;
    private double promedio;
    private double varianza;
    private int nConfianza;
    private int desviacionE;

    public Ejercicio(int muestra, double promedio, double varianza, int nConfianza, int desviacionE) {
        this.muestra = muestra;
        this.promedio = promedio;
        this.varianza = varianza;
        this.nConfianza = nConfianza;
        this.desviacionE = desviacionE;
    }    
    
    public double getnConfianza() {
        return nConfianza;
    }

    public void setnConfianza(int nConfianza) {
        this.nConfianza = nConfianza;
    }

    public int getMuestra() {
        return muestra;
    }

    public void setMuestra(int muestra) {
        this.muestra = muestra;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getVarianza() {
        return varianza;
    }

    public void setVarianza(double varianza) {
        this.varianza = varianza;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
}
