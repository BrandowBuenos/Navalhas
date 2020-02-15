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

    private JLabel line;
    private JLabel lContador;
    private JLabel lServico;
    private JLabel lValor;
    private JLabel label;

    private JLabel lBarbeiro;

    public RelatoriosAnual() {

        removeAll();

        setBounds(45, 182, 1275, 460);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        description = new JPanel();
        description.setLayout(null);
        description.setBounds(0, 0, 175, 460);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/chart-icon.png")));
        customerIcon.setBounds(65, 196, 55, 55);
        description.add(customerIcon);

        label = new JLabel("Nº");
        label.setBounds(210, 10, 55, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        label = new JLabel("Serviço");
        label.setBounds(270, 10, 100, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        label = new JLabel("Total");
        label.setBounds(465, 10, 100, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        lContador = new JLabel("09");
        lContador.setBounds(210, 70, 50, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Corte");
        lServico.setBounds(270, 70, 100, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 250,00");
        lValor.setBounds(465, 70, 100, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        lContador = new JLabel("00");
        lContador.setBounds(210, 110, 50, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Barba");
        lServico.setBounds(270, 110, 100, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 110, 100, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        line = new JLabel();
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/line1.png")));
        line.setBounds(600, 5, 889, 450);
        add(line);

        label = new JLabel("Funcionário");
        label.setBounds(630, 10, 150, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        label = new JLabel("Nº de serviços");
        label.setBounds(780, 10, 150, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        lBarbeiro = new JLabel("Raimundo");
        lBarbeiro.setBounds(630, 70, 100, 24);
        lBarbeiro.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lBarbeiro.setForeground(new Color(110, 110, 110));
        add(lBarbeiro);

        lContador = new JLabel("09");
        lContador.setBounds(830, 70, 50, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lBarbeiro = new JLabel("Sérgio");
        lBarbeiro.setBounds(630, 110, 100, 24);
        lBarbeiro.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lBarbeiro.setForeground(new Color(110, 110, 110));
        add(lBarbeiro);

        lContador = new JLabel("10");
        lContador.setBounds(830, 110, 50, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        label = new JLabel("Clientes atendidos: 100");
        label.setBounds(630, 380, 400, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        line = new JLabel();
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/line1.png")));
        line.setBounds(950, 5, 889, 450);
        add(line);

        label = new JLabel("Total de Rendimentos");
        label.setBounds(1010, 180, 400, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        label = new JLabel("R$ 20.000,00");
        label.setBounds(1050, 230, 400, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

    }

    public void actionPerformed(ActionEvent ae) {

    }

}
