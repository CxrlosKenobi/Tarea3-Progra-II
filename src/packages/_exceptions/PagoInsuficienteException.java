package packages._exceptions;
import java.lang.Exception;

public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException() {
        super("El pago no es suficiente");
    }
}
