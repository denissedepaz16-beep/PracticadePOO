package poo.pagina47.Ejercicio3;

    public class Main {

        public static void main(String[] args) {

            Profesion profesor = new Profesor(800, 10, 15);
            Profesion programador = new Programador(1200);

            System.out.println("Sueldo del Profesor: " + profesor.calcularSueldo());
            System.out.println("Sueldo del Programador: " + programador.calcularSueldo());
        }
    }
