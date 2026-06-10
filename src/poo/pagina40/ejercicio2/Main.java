package poo.pagina40.ejercicio2;

public class Main {

    public static void main(String[] args) {

        Juego juego = new Juego();

        juego.jugarNivel1();
        juego.jugarNivel2();

        System.out.println("\n==============================");
        System.out.println("RESULTADO FINAL");
        System.out.println("==============================");
        System.out.println("Puntaje acumulado de los dos niveles: "
                + juego.getPuntajeAcumulado());
    }
}