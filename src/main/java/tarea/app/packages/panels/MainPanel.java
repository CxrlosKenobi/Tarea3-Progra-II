package tarea.app.packages.panels;

//
// Import expendedor
import tarea.app.packages.machine.Expendedor;
import tarea.app.packages.customer.Comprador;
import tarea.app.packages._exceptions.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainPanel extends JPanel implements MouseListener {
    private Comprador customer;
    private Expendedor machine;
    

    public MainPanel() throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        this.machine = new Expendedor(5, 500);
        this.customer = new Comprador();
        this.addMouseListener(this);
    }

    Image image = new ImageIcon("assets/images/backgroundWall.jpg").getImage();

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, 1280, 680, this);
        this.customer.paint(g);
        this.machine.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {

        System.out.println("Mouse clicked at " + e.getX() + ", " + e.getY());

        // if i click on the button i will buy a drink}
        if (e.getX() >= 0 && e.getX() <= 200 && e.getY() >= 0 && e.getY() <= 200) {
            try {
                machine.comprarBebida(null, 0);
                System.out.println("Bebida comprada");
            } catch (NoHayBebidaException | PagoInsuficienteException | PagoIncorrectoException ex) {
                ex.printStackTrace();
            }
        }

    }

    

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
