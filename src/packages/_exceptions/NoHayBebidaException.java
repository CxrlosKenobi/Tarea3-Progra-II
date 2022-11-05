package packages._exceptions;
import java.lang.Exception;

public class NoHayBebidaException extends Exception {
    public NoHayBebidaException() {
        super("No hay bebidas disponibles en el dispensador, para el tipo de bebida solicitada");
    }
}
