package ui;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

/**
 * Classe que inicia o programa e cria a estrutura básica (Cabecalho, logo,
 * menu e rodape)
 */
public class Janela implements ActionListener {

    public static JFrame frame;
    public JLabel fundo;
    public JLabel logo;

    public JPanel menu;
    public JButton bClientes;
    public JButton bAssinaturas;
    public JButton bRelatorios;

    public static JPanel panel;
    private JLabel message;

    public JPanel rodape;
    public JLabel whatsapp;
    public JLabel instagram;
    public JLabel facebook;

    public int width;
    public int height;

    public Janela() {

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        width = (int) d.getWidth();
        height = (int) d.getHeight();

        frame = new JFrame("Barbearia Navalhas");
        frame.getContentPane().setBackground(new Color(247, 247, 247));
        frame.setSize(width, height);
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);

        // Painel aqui para nao atrapalhar na transparencia
        panel = new JPanel();
        panel.setBounds(65, 400, 1790, 350);
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        frame.getContentPane().add(panel);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy -- hh:mm");

        message = new JLabel("Olá :) , hoje é: " + dateFormat.format(new Date()));
        message.setBounds(700, 150, 420, 25);
        message.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        panel.add(message);

        fundo = new JLabel();
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/background.png")));
        fundo.setBounds(0, 0, width, height);
        frame.getContentPane().add(fundo);

        logo = new JLabel("");
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/logo.png")));
        logo.setBounds(height / 17, height / 43, height / 3, height / 4);
        frame.getContentPane().add(logo);

        menu = new JPanel();
        menu.setBounds(width / 5 + 30, width / 19 + 20, width / 2 + 380, width / 24);
        menu.setBackground(new Color(34, 34, 34));
        menu.setLayout(null);

        bClientes = new JButton("    Clientes");
        bClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-icon.png")));
        bClientes.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        bClientes.setForeground(new Color(255, 255, 255));
        bClientes.setBounds(-40, -10, 488, 80);
        bClientes.setContentAreaFilled(false);
        bClientes.setBorderPainted(false);
        bClientes.setFocusable(false);
        bClientes.addActionListener(this);
        menu.add(bClientes);

        bAssinaturas = new JButton("    Assinaturas");
        bAssinaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signature-icon.png")));
        bAssinaturas.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        bAssinaturas.setForeground(new Color(255, 255, 255));
        bAssinaturas.setBounds(width / 4 - 40, -10, 488, 80);
        bAssinaturas.setContentAreaFilled(false);
        bAssinaturas.setBorderPainted(false);
        bAssinaturas.setFocusable(false);
        bAssinaturas.addActionListener(this);
        menu.add(bAssinaturas);

        bRelatorios = new JButton("    Relatórios");
        bRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/report-icon.png")));
        bRelatorios.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        bRelatorios.setForeground(new Color(255, 255, 255));
        bRelatorios.setBounds(width / 2 - 40, -10, 493, 80);
        bRelatorios.setContentAreaFilled(false);
        bRelatorios.setBorderPainted(false);
        bRelatorios.setFocusable(false);
        bRelatorios.addActionListener(this);
        menu.add(bRelatorios);
        frame.getContentPane().add(menu);

        whatsapp = new JLabel();
        whatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/whatsapp-icon.png")));
        whatsapp.setBounds(width / 30, width / 2 - 15, 500, 100);
        frame.getContentPane().add(whatsapp);

        whatsapp = new JLabel("(94) 99129-0504");
        whatsapp.setBounds(125, width / 2 - 25, 500, 100);
        whatsapp.setFont(new Font("Helvetica Neue", Font.PLAIN, 22));
        whatsapp.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(whatsapp);

        whatsapp = new JLabel("(94) 98146-2634");
        whatsapp.setBounds(125, width / 2 + 3, 500, 100);
        whatsapp.setFont(new Font("Helvetica Neue", Font.PLAIN, 22));
        whatsapp.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(whatsapp);

        instagram = new JLabel("   Barbearia.Navalhas");
        instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/instagram-icon.png")));
        instagram.setBounds(width / 3 + 120, width / 2 - 15, 500, 100);
        instagram.setFont(new Font("Helvetica Neue", Font.PLAIN, 22));
        instagram.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(instagram);

        facebook = new JLabel("   @barbearianavalhasparauapebas");
        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/facebook-icon.png")));
        facebook.setBounds(width - 450, width / 2 - 15, 500, 100);
        facebook.setFont(new Font("Helvetica Neue", Font.PLAIN, 22));
        facebook.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(facebook);

        rodape = new JPanel();
        rodape.setBounds(0, width / 2, width, width / 24 + 50);
        rodape.setBackground(new Color(34, 34, 34));
        rodape.setLayout(null);
        frame.getContentPane().add(rodape);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bClientes) {

            panel.setVisible(false);
            Clientes cli = new Clientes();
            frame.getContentPane().add(cli);
            cli.setVisible(true);
        }

        
        if (ae.getSource() == bAssinaturas) {

            panel.setVisible(false);
            Assinaturas ass = new Assinaturas();
            frame.getContentPane().add(ass);
            ass.setVisible(true);
        }

        

    }

    // Metodo para a correta mudança de paineis
    public static void panelInicio(JPanel j) {
        frame.add(j);
        j.setVisible(true);
    }

   
}
