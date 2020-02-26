package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Relatorios
 */
public class RelatoriosSemanalBarbeiro extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;

    private JLabel line;
    private JLabel lContador;
    private JLabel lServico;
    private JLabel lValor;
    private JLabel label;

    private JButton bBarbeiro;

    public RelatoriosSemanalBarbeiro() {

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
        label.setBounds(300, 10, 100, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        label = new JLabel("Total");
        label.setBounds(465, 10, 100, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        lContador = new JLabel("00");
        lContador.setBounds(210, 90, 80, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Corte");
        lServico.setBounds(300, 90, 100, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 90, 200, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        // Barba

        lContador = new JLabel("00");
        lContador.setBounds(210, 135, 80, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Barba");
        lServico.setBounds(300, 135, 100, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 135, 200, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        // Sombrancelha

        lContador = new JLabel("00");
        lContador.setBounds(210, 180, 80, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Sombrancelha");
        lServico.setBounds(300, 180, 150, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 180, 200, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        // Coloracao

        lContador = new JLabel("00");
        lContador.setBounds(210, 225, 80, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Coloração");
        lServico.setBounds(300, 225, 100, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 225, 200, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        // Pigmentacao em barba

        lContador = new JLabel("00");
        lContador.setBounds(210, 270, 80, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Pigmentação");
        lServico.setBounds(300, 270, 180, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 270, 200, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        // Selagem

        lContador = new JLabel("00");
        lContador.setBounds(210, 315, 80, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Selagem");
        lServico.setBounds(300, 315, 100, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 315, 200, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        // Relaxamento

        lContador = new JLabel("00");
        lContador.setBounds(210, 360, 80, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Relaxamento");
        lServico.setBounds(300, 360, 150, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 360, 200, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        // Luzes

        lContador = new JLabel("00");
        lContador.setBounds(210, 405, 80, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lServico = new JLabel("Luzes");
        lServico.setBounds(300, 405, 100, 24);
        lServico.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lServico.setForeground(new Color(110, 110, 110));
        add(lServico);

        lValor = new JLabel("R$ 0,00");
        lValor.setBounds(465, 405, 200, 24);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

               //
        line = new JLabel();
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/line1.png")));
        line.setBounds(600, 5, 889, 450);
        add(line);

        label = new JLabel("Hugo");
        label.setBounds(630, 120, 150, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        add(label);

        label = new JLabel("Quantidade de serviços: 3193");
        label.setBounds(630, 180, 300, 55);
        label.setForeground(new Color(115, 115, 115));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        label = new JLabel("Valor total: R$ 21.230,00");
        label.setBounds(630, 230, 300, 55);
        label.setForeground(new Color(115, 115, 115));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);

        label = new JLabel("Comissão: R$ 6.543,00");
        label.setBounds(630, 280, 300, 55);
        label.setForeground(new Color(47, 47, 47));
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        add(label);


    }

    public void actionPerformed(ActionEvent ae) {

    }

}
