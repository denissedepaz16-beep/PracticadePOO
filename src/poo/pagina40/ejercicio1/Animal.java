package poo.pagina40.ejercicio1;

public class Animal {
    private String Orden;
    private String Nombre;
    private String Extremidades;
    private String Raza;

    public Animal(String pOrden, String pNombre, String pExtremidades, String pRaza){
        Orden = pOrden;
        Nombre = pNombre;
        Extremidades = pExtremidades;
        Raza = pRaza;
    }

    public String getOrden() {
        return Orden;
    }

    public void setOrden(String orden) {
        Orden = orden;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getExtremidades() {
        return Extremidades;
    }

    public void setExtremidades(String extremidades) {
        Extremidades = extremidades;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }
}
