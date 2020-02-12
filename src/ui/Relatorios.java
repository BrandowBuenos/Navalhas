package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Relatorios
 */
public class Relatorios extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;

    private JButton bDiario;
    private JButton bSemanal;
    private JButton bMensal;
    private JButton bAnual;

    private final int WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public Relatorios() {

        setBounds(WIDTH / 30, WIDTH / 6, WIDTH - WIDTH / 15, WIDTH / 2);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        description = new JPanel();
        description.setLayout(null);
        description.setBounds(0, 0, WIDTH / 8, WIDTH / 4);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/chart-icon.png")));
        customerIcon.setBounds(WIDTH / 20, WIDTH / 11, 100, 100);
        description.add(customerIcon);

        bDiario = new JButton();
        bDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/circle-button.png")));
        bDiario.setBounds(WIDTH/6+50, HEIGHT/7+15, 280, 110);
        bDiario.setBackground(new Color(0,0,0));
        bDiario.setBorderPainted(false);
        bDiario.setContentAreaFilled(false);
        bDiario.setFocusable(false);
        bDiario.setLayout(null);
        bDiario.addActionListener(this);
        add(bDiario);

        JLabel diario = new JLabel("Diário");
        diario.setForeground(new Color(255, 255, 255));
        diario.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        diario.setBounds(110, 45, 100, 23);
        bDiario.add(diario);

        bSemanal = new JButton();
        bSemanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/circle-button.png")));
        bSemanal.setBounds(WIDTH/3+50, HEIGHT/7+15, 280, 110);
        bSemanal.setBackground(new Color(0,0,0));
        bSemanal.setBorderPainted(false);
        bSemanal.setContentAreaFilled(false);
        bSemanal.setFocusable(false);
        bSemanal.setLayout(null);
        bSemanal.addActionListener(this);
        add(bSemanal);

        JLabel lSemanal = new JLabel("Semanal");
        lSemanal.setForeground(new Color(255, 255, 255));
        lSemanal.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        lSemanal.setBounds(95, 45, 100, 23);
        bSemanal.add(lSemanal);

        bMensal = new JButton();
        bMensal.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/circle-button.png")));
        bMensal.setBounds(WIDTH/2+50, HEIGHT/7+15, 280, 110);
        bMensal.setBackground(new Color(0,0,0));
        bMensal.setBorderPainted(false);
        bMensal.setContentAreaFilled(false);
        bMensal.setFocusable(false);
        bMensal.setLayout(null);
        bMensal.addActionListener(this);
        add(bMensal);

        JLabel lMensal = new JLabel("Mensal");
        lMensal.setForeground(new Color(255, 255, 255));
        lMensal.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        lMensal.setBounds(95, 45, 100, 23);
        bMensal.add(lMensal);


        bAnual = new JButton();
        bAnual.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/circle-button.png")));
        bAnual.setBounds(WIDTH/2+370, HEIGHT/7+15, 280, 110);
        bAnual.setBackground(new Color(0,0,0));
        bAnual.setBorderPainted(false);
        bAnual.setContentAreaFilled(false);
        bAnual.setFocusable(false);
        bAnual.setLayout(null);
        bAnual.addActionListener(this);
        add(bAnual);

        JLabel lAnual = new JLabel("Anual");
        lAnual.setForeground(new Color(255, 255, 255));
        lAnual.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        lAnual.setBounds(105, 45, 100, 23);
        bAnual.add(lAnual);        

    }

    public void actionPerformed(ActionEvent ae) {

    }

}
