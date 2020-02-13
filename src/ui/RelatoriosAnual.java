package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Relatorios
 */
public class RelatoriosAnual extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;

    private JButton bVoltar;

    private final int WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public RelatoriosAnual() {

        setBounds(45, 182, 1275, 460);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        bVoltar = new JButton("<");
        bVoltar.setBounds(230, 50, 50, 50);
        bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
        bVoltar.setForeground(new Color(205, 92, 92));
        bVoltar.setBackground(new Color(255, 255, 255));
        bVoltar.addActionListener(this);
        add(bVoltar);

        description = new JPanel();
        description.setLayout(null);
        description.setBounds(0, 0, 175, 460);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/chart-icon.png")));
        customerIcon.setBounds(65, 196, 55, 55);
        description.add(customerIcon);


     

       

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bVoltar) {
            
            Relatorios rel = new Relatorios();
            setVisible(false);
            Janela.panelInicio(rel);
            rel.setVisible(true);

        }

    }

}
