package tarea.app.packages;
//
import javax.swing.JFrame;

public class Window extends JFrame {
    public Window() {
        this.setTitle("Expendedor de Bebidas");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
