package tarea.app;
//
import tarea.app.packages.Window;
import tarea.app.packages._exceptions.NoHayBebidaException;
import tarea.app.packages._exceptions.PagoIncorrectoException;
import tarea.app.packages._exceptions.PagoInsuficienteException;
import tarea.app.packages.PanelPrincipal;

/**
 * @author cxrloskenobi
 * @author sebasinmas 
*/

public class App {
    public static void main(String[] args) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        Window window = new Window();
        PanelPrincipal main = new PanelPrincipal();
        window.add(main);
    }
}
