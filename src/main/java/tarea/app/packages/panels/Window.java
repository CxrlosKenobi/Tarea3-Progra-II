package tarea.app.packages.panels;
//
import javax.swing.JFrame;

public class Window extends JFrame {
    public Window() {
        this.setTitle("Expendedor de Bebidas");
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
