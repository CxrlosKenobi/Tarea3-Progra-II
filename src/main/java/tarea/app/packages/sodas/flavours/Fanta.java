package tarea.app.packages.sodas.flavours;
import tarea.app.packages._exceptions.NoHayBebidaException;
import tarea.app.packages._exceptions.PagoIncorrectoException;
import tarea.app.packages._exceptions.PagoInsuficienteException;
//
import tarea.app.packages.sodas.Bebida;
import java.awt.*;

public class Fanta extends Bebida {
    public Fanta(int precio, int numSerie ) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        super("Fanta 350cc", precio, numSerie);
    }

    public String beber(){
        return "Estoy tomando una Fanta";
    }
    
    @Override
    public void paint(Graphics g, int x, int y){
        g.setColor(Color.orange);
        g.fillRect(x+150, y, 40, 60);
        g.setColor(Color.white);
        g.fillRect(x+150, y + 20, 40, 20);
    } 
}
    
  