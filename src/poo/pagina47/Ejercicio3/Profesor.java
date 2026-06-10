package poo.pagina47.Ejercicio3;

public class Profesor implements Profesion {

    private double sueldoBase;
    private double horasExtras;
    private double pagoPorHora;

    public Profesor(double sueldoBase, double horasExtras, double pagoPorHora) {
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (horasExtras * pagoPorHora);
    }
}