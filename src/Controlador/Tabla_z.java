package Controlador;
import Clases.*;
public class Tabla_z extends Ejercicio {

    public Tabla_z(int muestra, double promedio, int nConfianza, double desviacionE) {
        super(muestra, promedio, nConfianza, desviacionE);
    }
    
    public double alfa() {
        double porcentaje;
        double alfa;
        double nc = super.getnConfianza();
        porcentaje = (nc / 100);
        alfa = 1 - porcentaje;
        return alfa;
    }

    public double NumeroZ() {
        double z = 0;
        switch (super.getnConfianza()){
            case 50: 
                z = 0.67;
                break;
            case 60:
                z = 0.85;
                break;
            case 70:
                z = 1.03;
                break;
            case 80:
                z = 1.28;
                break;
            case 90:
                z = 1.65;
                break;
            case 95:
                z = 1.96;
                break;
            case 98:
                z = 2.33;
                break;
            case 99:
                z = 2.58;
                break;
        }
        return z;
    }
    
    public double intervaloA(){
        double inta;
        double raiz = Math.sqrt(super.getMuestra());
        inta = super.getPromedio() - NumeroZ() *(super.getDesviacionE()/raiz);
        return inta;
    }
    
    public double intervaloB(){
        double intb;
        double raiz = Math.sqrt(super.getMuestra());
        intb = super.getPromedio() + NumeroZ() *(super.getDesviacionE()/raiz);
        return intb;
    }

}
