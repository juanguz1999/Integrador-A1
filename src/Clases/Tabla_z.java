package Clases;

public class Tabla_z extends Ejercicio {

    int nConfianza2;

    public Tabla_z() {
        super(0, 0, 0, 0);
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
        double a;
        int b;
        switch (tz){
            case 1: a = 1;
        }
    }

}
