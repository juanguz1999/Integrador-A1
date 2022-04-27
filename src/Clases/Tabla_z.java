package Clases;

public class Tabla_z extends Ejercicio {

    public Tabla_z(int muestra, double promedio, double varianza, int nConfianza, int desviacionE) {
        super(muestra, promedio, varianza, nConfianza, desviacionE);
    }
    
    public double nivelConfianza() {
        double alfa;
        double porcentaje;
        porcentaje = (super.getnConfianza() / 100);
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
        double inta;
        double raiz = Math.sqrt(super.getMuestra());
        double tz = localizarTabla(numeroZ(nivelConfianza()));
        inta = super.getPromedio() - tz *(super.getDesviacionE()/raiz);
        return inta;
    }
    
    public double intervaloB(){
        double intb;
        double raiz = Math.sqrt(super.getMuestra());
        double tz = localizarTabla(numeroZ(nivelConfianza()));
        intb = super.getPromedio() + tz *(super.getDesviacionE()/raiz);
        return intb;
    }

}
