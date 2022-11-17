package tarea.app.packages.sodas;
//
import tarea.app.packages._exceptions.*;

public abstract class Bebida {
    private String nombre;
    private int precio;

    public Bebida(String nombre, int precio, int numSerie) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public abstract String beber();

    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio;
    }
}
