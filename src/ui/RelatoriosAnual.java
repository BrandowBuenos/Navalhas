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

        setBounds(WIDTH / 30, WIDTH / 6, WIDTH - WIDTH / 15, WIDTH / 2);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        bVoltar = new JButton("<");
        bVoltar.setBounds(WIDTH/6, HEIGHT/12, WIDTH/32, HEIGHT/24);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
        bVoltar.setForeground(new Color(205, 92, 92));
        bVoltar.addActionListener(this);
        add(bVoltar);

        description = new JPanel();
        description.setLayout(null);
        description.setBounds(0, 0, WIDTH / 8, WIDTH / 4);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/chart-icon.png")));
        customerIcon.setBounds(WIDTH / 20, WIDTH / 11, 100, 100);
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
