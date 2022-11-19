
package tarea.app.packages.sodas.flavours;
import tarea.app.packages._exceptions.NoHayBebidaException;
import tarea.app.packages._exceptions.PagoIncorrectoException;
import tarea.app.packages._exceptions.PagoInsuficienteException;
//
import tarea.app.packages.sodas.Bebida;
import java.awt.*;

public class CocaCola extends Bebida {
    public CocaCola(int precio, int numSerie) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        super("CocaCola 350cc", precio, numSerie);
    }
    public String beber(){
        return "Estoy tomando una Coca Cola";
    }

    @Override
    public void paint(Graphics g, int x, int y) {
        // xx = 626;
        // yy = 420;
        g.setColor(Color.red);
        g.fillRect(x, y, 40, 60);
        g.setColor(Color.white);
        g.fillRect(x, y + 20, 40, 20);
        
    }
   
}
