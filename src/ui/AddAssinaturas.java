package ui;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

/**
 * Customer Screen
 */
public class AddAssinaturas extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;

    private JLabel lNome;
    private JLabel lProfilePicture;
    private JLabel lData;

    private JLabel tabela;
    private JLabel total;

    private JButton bAddIcon;
    private JButton bRemoveIcon;

    private JLabel lDesc;
    private JLabel lValor;

    private JLabel lBarbeiro;

    private JCheckBox barb1;
    private JCheckBox barb2;
    private JCheckBox barb3;
    private JCheckBox barb4;

    private JLabel lFormaPagamento;
    
    private JCheckBox dinheiro;
    private JCheckBox cartao;

    private JButton bCancelar;
    private JButton bConfirmar;

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

        lProfilePicture = new JLabel();
        lProfilePicture.setBounds(230, 5, 100, 100);
        lProfilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/profile-picture.png")));
        add(lProfilePicture);

        lNome = new JLabel("Vinicius Correia Martins");
        lNome.setBounds(320, 35, 500, 25);
        lNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lNome.setForeground(new Color(47, 47, 47));
        add(lNome);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        lData = new JLabel(dateFormat.format(new Date()));
        lData.setBounds(320, 60, 300, 25);
        lData.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
        lData.setForeground(new Color(110, 110, 110));
        add(lData);

        tabela = new JLabel();
        tabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signatures-table.png")));
        tabela.setBounds(230, 110, 450, 350);
        add(tabela);

        total = new JLabel("VALOR");
        total.setBounds(605, 90, 100, 21);
        total.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        total.setForeground(new Color(110, 110, 110));
        add(total);

        bRemoveIcon = new JButton();
        bRemoveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signatures-remove-icon.png")));
        bRemoveIcon.setBounds(230, 130, 22,22);
        bRemoveIcon.setContentAreaFilled(false);
        bRemoveIcon.setBorderPainted(false);
        bRemoveIcon.setFocusable(false);
        bRemoveIcon.addActionListener(this);
        add(bRemoveIcon);

        lDesc = new JLabel("Corte");
        lDesc.setBounds(270, 130, 500, 25);
        lDesc.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lDesc.setForeground(new Color(110, 110, 110));
        add(lDesc);

        lValor = new JLabel("20,00");
        lValor.setBounds(605, 130, 100, 21);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 19));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        bAddIcon = new JButton();
        bAddIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signatures-add-icon.png")));
        bAddIcon.setBounds(230, 171, 22, 22);
        bAddIcon.setContentAreaFilled(false);
        bAddIcon.setBorderPainted(false);
        bAddIcon.setFocusable(false);
        bAddIcon.addActionListener(this);
        add(bAddIcon);

        lDesc = new JLabel("Barba");
        lDesc.setBounds(270, 171, 500, 25);
        lDesc.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        lDesc.setForeground(new Color(110, 110, 110));
        add(lDesc);

        lValor = new JLabel("-");
        lValor.setBounds(625, 171, 20, 21);
        lValor.setFont(new Font("Helvetica Neue", Font.PLAIN, 19));
        lValor.setForeground(new Color(110, 110, 110));
        add(lValor);

        lBarbeiro = new JLabel("Barbeiro");
        lBarbeiro.setBounds(780, 90, 120, 21);
        lBarbeiro.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lBarbeiro.setForeground(new Color(47, 47, 47));
        add(lBarbeiro);

        barb1 = new JCheckBox(" Mário");
        barb1.setBounds(780, 140, 180, 22);
        barb1.setFont(new Font("Helvetica Neue", Font.PLAIN, 19));
        barb1.setForeground(new Color(110, 110, 110));
        add(barb1);

        barb2 = new JCheckBox(" Raimundo");
        barb2.setBounds(780, 180, 180, 22);
        barb2.setFont(new Font("Helvetica Neue", Font.PLAIN, 19));
        barb2.setForeground(new Color(110, 110, 110));
        add(barb2);

        barb3 = new JCheckBox(" Hugo");
        barb3.setBounds(980, 140, 180, 22);
        barb3.setFont(new Font("Helvetica Neue", Font.PLAIN, 19));
        barb3.setForeground(new Color(110, 110, 110));
        add(barb3);

        barb4 = new JCheckBox(" Sérgio");
        barb4.setBounds(980, 180, 180, 22);
        barb4.setFont(new Font("Helvetica Neue", Font.PLAIN, 19));
        barb4.setForeground(new Color(110, 110, 110));
        add(barb4);


        lFormaPagamento = new JLabel("Forma de pagamento");
        lFormaPagamento.setBounds(780, 250, 250, 21);
        lFormaPagamento.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        lFormaPagamento.setForeground(new Color(47, 47, 47));
        add(lFormaPagamento);

        dinheiro = new JCheckBox(" Dinheiro");
        dinheiro.setBounds(780, 300, 180, 22);
        dinheiro.setFont(new Font("Helvetica Neue", Font.PLAIN, 19));
        dinheiro.setForeground(new Color(110, 110, 110));
        add(dinheiro);

        cartao = new JCheckBox(" Cartão");
        cartao.setBounds(980, 300, 180, 22);
        cartao.setFont(new Font("Helvetica Neue", Font.PLAIN, 19));
        cartao.setForeground(new Color(110, 110, 110));
        add(cartao);

        bCancelar = new JButton();
        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/cancel-button.png")));
        bCancelar.setBounds(1080, 385, 58, 58);
        bCancelar.setContentAreaFilled(false);
        bCancelar.setBorderPainted(false);
        bCancelar.setFocusable(false);
        bCancelar.addActionListener(this);
        add(bCancelar);

        bConfirmar = new JButton();
        bConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/confirm-button.png")));
        bConfirmar.setBounds(1135, 385, 120, 60);
        bConfirmar.setContentAreaFilled(false);
        bConfirmar.setBorderPainted(false);
        bConfirmar.setFocusable(false);
        bConfirmar.addActionListener(this);
        add(bConfirmar);



    }

    public void actionPerformed(ActionEvent ae) {

    }

}
