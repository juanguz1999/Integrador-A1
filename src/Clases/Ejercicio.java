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
    private int nConfianza;
    private double desviacionE;

    public Ejercicio(int muestra, double promedio, int nConfianza, double desviacionE) {
        this.muestra = muestra;
        this.promedio = promedio;
        this.nConfianza = nConfianza;
        this.desviacionE = desviacionE;
    }    
    
    public int getnConfianza() {
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

    public double getDesviacionE() {
        return desviacionE;
    }

    public void setDesviacionE(double desviacionE) {
        this.desviacionE = desviacionE;
    }
    
}
