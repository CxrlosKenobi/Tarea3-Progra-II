package packages.views;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.event.*;
import java.io.ObjectInputFilter.Status;
import java.awt.*;

import packages.Comprador;
import packages.vendingMachine.Expendedor;

public class MainView extends JFrame {
    private Comprador comprador;
    private Expendedor expendedor;

    public MainView() {

        this.setTitle("Maquina expendedora");
        this.setSize(1280, 720);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //remove decorations

        // All code above this line is to set up the window
        // All code below this line is to set up the components
        this.add(new MainPanel());
        this.add(new SecondaryPanel(), BorderLayout.SOUTH);

    }

}

class SecondaryPanel extends JPanel {
    public SecondaryPanel() {
        this.setBackground(Color.gray);
        this.setPreferredSize(new Dimension(1280, 40));
        this.setLayout(new FlowLayout());
        // add close button
        ButtonsApp cerrarButton = new ButtonsApp("Cerrar", 1);
        ButtonsApp potoButton = new ButtonsApp("Poto", 2);

        this.add(cerrarButton);
        this.add(potoButton);

    }
}

class ButtonsApp extends JButton implements ActionListener {
    private int identifier;

    public ButtonsApp(String text, int identifier) {
        super(text);
        this.identifier = identifier;
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (this.identifier) {
            case 1:
                System.exit(0);
                break;
            case 2:
                System.out.print("Poto");
                break;
            case 3:
                break;
        }
        
    }

}

class MainPanel extends JPanel {
    private Expendedor exp;
    private Comprador comp;


    public MainPanel() {
        this.exp = new Expendedor(5, 500);
        this.setBackground(Color.red);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse clicked 🚀 at: "+ e.getX() + ", " + e.getY());

            }
        });
    }
    //loads a background image
    Image image = getToolkit().getImage("src\\assets\\images\\backgroundWall.jpg");

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, 1280, 680, this);
        exp.paint(g);
    }
}