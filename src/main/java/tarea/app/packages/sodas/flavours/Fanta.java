package tarea.app.packages.sodas.flavours;
import tarea.app.packages._exceptions.NoHayBebidaException;
import tarea.app.packages._exceptions.PagoIncorrectoException;
import tarea.app.packages._exceptions.PagoInsuficienteException;
//
import tarea.app.packages.sodas.Bebida;

public class Fanta extends Bebida {
    public Fanta(int precio, int numSerie ) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        super("Fanta 350cc", precio, numSerie);
    }

    public String beber(){
        return "Estoy tomando una Fanta";
    } 
}
    
  