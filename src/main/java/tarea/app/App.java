package tarea.app;
//
import tarea.app.packages.Window;
import tarea.app.packages.PanelPrincipal;

/**
 * @author cxrloskenobi
 * @author sebasinmas 
*/

public class App {
    public static void main(String[] args) {
        Window window = new Window();
        PanelPrincipal main = new PanelPrincipal();
        window.add(main);
    }
}
