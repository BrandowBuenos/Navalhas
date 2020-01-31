package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Customer Screen
 */
public class Assinaturas extends JPanel implements ActionListener {

    private JPanel body;
    private JPanel description;
    private JLabel customerIcon;

    private JTextField tPesquisa;
    private JButton bPesquisa;

    private JLabel line;

    private final int WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public Assinaturas() {

        body = new JPanel();
        body.setBounds(WIDTH / 30, WIDTH / 6, WIDTH - WIDTH / 15, WIDTH / 4);
        body.setBackground(new Color(255, 255, 255));
        body.setLayout(null);
        Janela.frame.getContentPane().add(body);

        description = new JPanel();
        description.setBounds(0, 0, WIDTH / 8, WIDTH / 4);
        description.setBackground(new Color(234, 234, 234));
        body.add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signatures-icon.png")));
        customerIcon.setBounds(WIDTH / 38, HEIGHT / 2, 0, 0);
        description.add(customerIcon);

        tPesquisa = new JTextField("Pesquisa");
        tPesquisa.setBounds(WIDTH / 5, HEIGHT / 12, 384, 48);
        tPesquisa.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tPesquisa.setForeground(new Color(90, 90, 90));
        tPesquisa.setBackground(new Color(252, 252, 252));
        tPesquisa.setHorizontalAlignment(JTextField.CENTER);
        tPesquisa.setBorder(new LineBorder(new Color(210, 210, 210)));
        body.add(tPesquisa);

        bPesquisa = new JButton("");
        bPesquisa.setBounds(WIDTH / 6, HEIGHT / 12, 65, 48);
        bPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/search-button.png")));
        bPesquisa.setBackground(new Color(234, 234, 234));
        bPesquisa.addActionListener(this);
        body.add(bPesquisa);

        line = new JLabel();
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/division-line.png")));
        line.setBounds(WIDTH/3+200, HEIGHT / 20, 889, 328);
        body.add(line);

    }

    public void actionPerformed(ActionEvent ae) {

    }

}
