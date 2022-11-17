package tarea.app;
import tarea.app.packages._exceptions.NoHayBebidaException;
import tarea.app.packages._exceptions.PagoIncorrectoException;
import tarea.app.packages._exceptions.PagoInsuficienteException;
import tarea.app.packages.panels.Window;
import tarea.app.packages.panels.*;
import java.awt.*;

/**
 * @author cxrloskenobi
 * @author sebasinmas 
*/

public class App {
    public static void main(String[] args) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        Window window = new Window();
        MainPanel mainPanel = new MainPanel();
        SecondaryPanel secondaryPanel = new SecondaryPanel();

        window.add(mainPanel);
        window.add(secondaryPanel, BorderLayout.SOUTH);
        window.setVisible(true);
    }
}
