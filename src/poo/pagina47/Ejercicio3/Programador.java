package poo.pagina47.Ejercicio3;

public class Programador implements Profesion {

    private double salarioMensual;

    public Programador(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }
}