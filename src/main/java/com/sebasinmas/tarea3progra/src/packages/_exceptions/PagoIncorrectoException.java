package packages._exceptions;
import java.lang.Exception;

public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException() {
        super("No se ha realizado el pago correctamente");
    }
}
