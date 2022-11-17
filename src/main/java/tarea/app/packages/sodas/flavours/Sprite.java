package tarea.app.packages.sodas.flavours;
import tarea.app.packages._exceptions.NoHayBebidaException;
import tarea.app.packages._exceptions.PagoIncorrectoException;
import tarea.app.packages._exceptions.PagoInsuficienteException;
//
import tarea.app.packages.sodas.Bebida;

public class Sprite extends Bebida {
    public Sprite(int precio, int numSerie ) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        super("Sprite 350cc", precio, numSerie);
    }

    public String beber(){
        return "Estoy tomando una Sprite";
    } 
}
