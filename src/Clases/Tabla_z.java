package Clases;

public class Tabla_z extends Ejercicio {

    public Tabla_z(int nConfianza2, int muestra, double promedio, double varianza, int nConfianza, int desviacionE) {
        super(muestra, promedio, varianza, nConfianza, desviacionE);
    }
    
    public double nivelConfianza(int nConfianza2) {
        double alfa;
        double porcentaje;
        porcentaje = (nConfianza2 / 100);
        alfa = 1 - porcentaje;
        return alfa;
    }

    public double numeroZ(double alfa) {
        double tz;
        double div;
        div = (alfa/2);
        tz = 1 - div;
        return tz;
    }

    public double localizarTabla(double tz) {
        double a = 0;
        return a;
    }
    
    public double intervaloA(){
        
    }

}
