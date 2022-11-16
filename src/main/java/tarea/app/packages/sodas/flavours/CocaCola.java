
package tarea.app.packages.sodas.flavours;
import tarea.app.packages._exceptions.NoHayBebidaException;
import tarea.app.packages._exceptions.PagoIncorrectoException;
import tarea.app.packages._exceptions.PagoInsuficienteException;
//
import tarea.app.packages.sodas.Bebida;

public class CocaCola extends Bebida {
    public CocaCola(int precio, int numSerie) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        super("CocaCola 350cc", precio, numSerie);
    }
    public String beber(){
        return "Estoy tomando una Coca Cola";
    } 
}
