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

    private JLabel tabela;

    public AddAssinaturas() {

        setBounds(45, 182, 1275, 460);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        description = new JPanel();
        description.setLayout(null);
        description.setBounds(0, 0, 175, 460);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signatures-icon.png")));
        customerIcon.setBounds(65, 196, 50, 45);
        description.add(customerIcon);


        tabela = new JLabel();
        tabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signatures-table.png")));
        tabela.setBounds(230, 90, 450, 350);
        add(tabela);
        

    }

    public void actionPerformed(ActionEvent ae) {

        

    }

}
