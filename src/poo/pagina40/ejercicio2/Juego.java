package poo.pagina40.ejercicio2;

import java.util.Scanner;

public class Juego {

    private int puntajeAcumulado;
    private Scanner scanner;

    public Juego() {
        puntajeAcumulado = 0;
        scanner = new Scanner(System.in);
    }

    public void jugarNivel1() {

        System.out.println("\n===== NIVEL 1 =====");
        System.out.println("Cada respuesta correcta vale 10 puntos.\n");

        System.out.println("1. ¿Qué significa POO?");
        System.out.println("A) Programación Orientada a Objetos");
        System.out.println("B) Procesos Operativos Organizados");
        System.out.print("Respuesta: ");

        String respuesta = scanner.nextLine().toUpperCase();

        if (respuesta.equals("A")) {
            puntajeAcumulado += 10;
            System.out.println("Correcto (+10)");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("\n2. ¿Cuál es el método principal de Java?");
        System.out.println("A) start()");
        System.out.println("B) main()");
        System.out.print("Respuesta: ");

        respuesta = scanner.nextLine().toUpperCase();

        if (respuesta.equals("B")) {
            puntajeAcumulado += 10;
            System.out.println("Correcto (+10)");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("\nPuntaje al finalizar Nivel 1: " + puntajeAcumulado);
    }

    public void jugarNivel2() {

        System.out.println("\n===== NIVEL 2 =====");
        System.out.println("Correcta = +20 puntos");
        System.out.println("Incorrecta = -10 puntos\n");

        System.out.println("1. ¿Qué pilar de POO protege los datos?");
        System.out.println("A) Herencia");
        System.out.println("B) Encapsulamiento");
        System.out.println("C) Polimorfismo");
        System.out.print("Respuesta: ");

        String respuesta = scanner.nextLine().toUpperCase();

        if (respuesta.equals("B")) {
            puntajeAcumulado += 20;
        } else {
            puntajeAcumulado -= 10;
        }

        System.out.println("\n2. ¿Qué método compara Strings?");
        System.out.println("A) ==");
        System.out.println("B) equals()");
        System.out.println("C) compare()");
        System.out.print("Respuesta: ");

        respuesta = scanner.nextLine().toUpperCase();

        if (respuesta.equals("B")) {
            puntajeAcumulado += 20;
        } else {
            puntajeAcumulado -= 10;
        }

        System.out.println("\n3. ¿Qué palabra define una constante?");
        System.out.println("A) static");
        System.out.println("B) const");
        System.out.println("C) final");
        System.out.print("Respuesta: ");

        respuesta = scanner.nextLine().toUpperCase();

        if (respuesta.equals("C")) {
            puntajeAcumulado += 20;
        } else {
            puntajeAcumulado -= 10;
        }

        System.out.println("\n4. En un arreglo de tamaño 5, ¿cuál es el último índice?");
        System.out.println("A) 4");
        System.out.println("B) 5");
        System.out.println("C) 6");
        System.out.print("Respuesta: ");

        respuesta = scanner.nextLine().toUpperCase();

        if (respuesta.equals("A")) {
            puntajeAcumulado += 20;
        } else {
            puntajeAcumulado -= 10;
        }
    }

    public int getPuntajeAcumulado() {
        return puntajeAcumulado;
    }
}
