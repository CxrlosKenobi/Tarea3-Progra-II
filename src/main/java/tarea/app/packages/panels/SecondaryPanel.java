package tarea.app.packages.panels;
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondaryPanel extends JPanel {
    public SecondaryPanel() {
        this.setBackground(Color.decode("#252525"));
        this.setPreferredSize(new Dimension(1280, 40));
        this.setLayout(new FlowLayout());

        ButtonsApp closeBtn = new ButtonsApp("Cerrar", 1);
        ButtonsApp auxBtn = new ButtonsApp("Aux", 2);

        this.add(closeBtn);
        this.add(auxBtn);
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
    public void actionPerformed(ActionEvent event) {
        switch (this.identifier) {
            case 1:
                System.exit(0);
                break;
            case 2:
                System.out.println("Aux");
                break;
        }
    }
}
