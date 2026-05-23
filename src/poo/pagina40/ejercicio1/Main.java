package poo.pagina40.ejercicio1;

public class Main {
    static void main() {
        Animal gato = new Animal("Carnivoro", "Bigotes", "4", "persa");

        System.out.println("Nombre: " + gato.getNombre());
        System.out.println("Orden: " + gato.getOrden());
        System.out.println("Extremidades: " + gato.getExtremidades());
        System.out.println("Raza: " + gato.getRaza());

        Animal loro = new Animal("Psittaciformes","Roberto", "2", "ecléctico");
        System.out.println("Nombre: " + loro.getNombre());
        System.out.println("Orden: " + loro.getOrden());
        System.out.println("Extremidades: " + loro.getExtremidades());
        System.out.println("Raza: " + loro.getRaza());
    }
}
