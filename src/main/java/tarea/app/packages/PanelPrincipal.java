package tarea.app.packages;
//
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import tarea.app.packages.customer.Comprador;
import tarea.app.packages.machine.Expendedor;

public class PanelPrincipal extends JPanel implements MouseListener {
    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal() {
        exp = new Expendedor();
        com = new Comprador();
        this.setBackground(Color.blue);
        this.setLayout(null);
        this.setBounds(0, 0, 700, 600);
        this.addMouseListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

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
