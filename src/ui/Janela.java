package ui;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

/**
 * Classe que inicia o programa e cria a estrutura basica (Logo, menu e rodape)
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
        
        // Frame

        frame = new JFrame("Barbearia Navalhas");
        frame.setSize(1366, 768);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Painel de conteudo (nesta posicao para nao atrapalhar na transparencia)

        panel = new JPanel();
        panel.setBounds(45, 182, 1275, 460);
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        frame.getContentPane().add(panel);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy -- hh:mm");

        message = new JLabel("Olá :) , hoje é: " + dateFormat.format(new Date()));
        message.setBounds(480, 230, 420, 25);
        message.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        panel.add(message);

        // Fundo

        fundo = new JLabel();
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/background.png")));
        fundo.setBounds(0, 0, 1366, 768);
        frame.getContentPane().add(fundo);

        // Logo

        logo = new JLabel("");
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/logo.png")));
        logo.setBounds(52, 5, 160, 160);
        frame.getContentPane().add(logo);

        // Menu

        menu = new JPanel();
        menu.setBounds(276, 55, 1045, 56);
        menu.setBackground(new Color(34, 34, 34));
        menu.setLayout(null);

        bClientes = new JButton("    Clientes");
        bClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-icon.png")));
        bClientes.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        bClientes.setForeground(new Color(255, 255, 255));
        bClientes.setBounds(0, 0, 348, 56);
        bClientes.setContentAreaFilled(false);
        bClientes.setBorderPainted(false);
        bClientes.setFocusable(false);
        bClientes.addActionListener(this);
        menu.add(bClientes);

        bAssinaturas = new JButton("    Assinaturas");
        bAssinaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signature-icon.png")));
        bAssinaturas.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        bAssinaturas.setForeground(new Color(255, 255, 255));
        bAssinaturas.setBounds(348,0,348,56);
        bAssinaturas.setContentAreaFilled(false);
        bAssinaturas.setBorderPainted(false);
        bAssinaturas.setFocusable(false);
        bAssinaturas.addActionListener(this);
        menu.add(bAssinaturas);

        bRelatorios = new JButton("   Relatórios");
        bRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/report-icon.png")));
        bRelatorios.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        bRelatorios.setForeground(new Color(255, 255, 255));
        bRelatorios.setBounds(696,0,348,56);
        bRelatorios.setContentAreaFilled(false);
        bRelatorios.setBorderPainted(false);
        bRelatorios.setFocusable(false);
        bRelatorios.addActionListener(this);
        menu.add(bRelatorios);
        frame.getContentPane().add(menu);

        // Rodape

        whatsapp = new JLabel();
        whatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/whatsapp-icon.png")));
        whatsapp.setBounds(47, 705, 26, 26);
        frame.getContentPane().add(whatsapp);

        whatsapp = new JLabel("(94) 99129-0504");
        whatsapp.setBounds(88, 698, 140, 19);
        whatsapp.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        whatsapp.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(whatsapp);

        whatsapp = new JLabel("(94) 98146-2634");
        whatsapp.setBounds(88, 718 , 140, 19);
        whatsapp.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        whatsapp.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(whatsapp);

        instagram = new JLabel("   Barbearia.Navalhas");
        instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/instagram-icon.png")));
        instagram.setBounds(496, 705, 220, 27);
        instagram.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        instagram.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(instagram);

        facebook = new JLabel("   @barbearianavalhasparauapebas");
        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/facebook-icon.png")));
        facebook.setBounds(1000, 705, 340, 26);
        facebook.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        facebook.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(facebook);

        rodape = new JPanel();
        rodape.setBounds(0, 688, 1366, 80);
        rodape.setBackground(new Color(34, 34, 34));
        rodape.setLayout(null);
        frame.getContentPane().add(rodape);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bClientes) {

            panel.setVisible(false);
            panel.removeAll();
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

        if (ae.getSource() == bRelatorios) {

            panel.setVisible(false);
            Relatorios rel = new Relatorios();
            frame.getContentPane().add(rel);
            rel.setVisible(true);
        }

    }

    // Metodo para a correta mudança de paineis
    public static void panelInicio(JPanel j) {
        frame.add(j);
        j.setVisible(true);
    }

}