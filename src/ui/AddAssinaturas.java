package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Customer Screen
 */
public class AddAssinaturas extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;


    private final int WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public AddAssinaturas() {

        setBounds(WIDTH / 30, WIDTH / 6, WIDTH - WIDTH / 15, WIDTH / 2);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        description = new JPanel();
        description.setLayout(null);
        description.setBounds(0, 0, WIDTH / 8, WIDTH / 4);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signatures-icon.png")));
        customerIcon.setBounds(WIDTH / 20, WIDTH / 11, 100, 100);
        description.add(customerIcon);

        

    }

    public void actionPerformed(ActionEvent ae) {

        

    }

}
