package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Customer Screen
 */
public class AddClientes extends JPanel implements ActionListener {

    private JPanel body;
    private JPanel description;
    private JLabel customerIcon;

    public AddClientes() {
        body();

    }

    private void body() {

        body = new JPanel();
        body.setBounds(65, 330, 1790,540);
        body.setBackground(new Color(255, 255, 255));
        body.setLayout(null);
        Janela.frame.getContentPane().add(body);

        description = new JPanel();
        description.setBounds(0, 0, 246, 530);
        description.setBackground(new Color(234, 234, 234));
        body.add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-add.png")));
        customerIcon.setBounds(50, 50, 0, 0);
        description.add(customerIcon);

        JButton bFoto = new JButton();
        bFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/picture-customer.png")));
        bFoto.setBounds(770, 40, 120, 120);
        bFoto.setContentAreaFilled(false);
        bFoto.setBorderPainted(false);
        bFoto.setFocusable(false);
        bFoto.addActionListener(this);
        body.add(bFoto);

        JLabel nome = new JLabel("Nome");
        nome.setBounds(600, 130, 200, 60);
        nome.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        nome.setForeground(new Color(131, 131, 131));
        body.add(nome);

        JTextField tNome = new JTextField("");
        tNome.setBounds(600, 200, 448, 60);
        tNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tNome.setForeground(new Color(47, 47, 47));
        body.add(tNome);

        JLabel contatos = new JLabel("Contatos");
        contatos.setBounds(600, 270, 200, 60);
        contatos.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        contatos.setForeground(new Color(131, 131, 131));
        body.add(contatos);

        JTextField tDDDContato1 = new JTextField("");
        tDDDContato1.setBounds(600, 350, 70, 60);
        tDDDContato1.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tDDDContato1.setForeground(new Color(47, 47, 47));
        body.add(tDDDContato1);

        JTextField tContato1 = new JTextField("");
        tContato1.setBounds(687, 350, 362, 60);
        tContato1.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tContato1.setForeground(new Color(47, 47, 47));
        body.add(tContato1);

        JTextField tDDDContato2 = new JTextField("");
        tDDDContato2.setBounds(600, 430, 70, 60);
        tDDDContato2.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tDDDContato2.setForeground(new Color(47, 47, 47));
        body.add(tDDDContato2);

        JTextField tContato2 = new JTextField("");
        tContato2.setBounds(687, 430, 362, 60);
        tContato2.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tContato2.setForeground(new Color(47, 47, 47));
        body.add(tContato2);

        JButton bCancelar = new JButton();
        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/cancel-button.png")));
        bCancelar.setBounds(1520, 420, 80, 80);
        bCancelar.setContentAreaFilled(false);
        bCancelar.setBorderPainted(false);
        bCancelar.setFocusable(false);
        bCancelar.addActionListener(this);
        body.add(bCancelar);

        JButton bConfirmar = new JButton();
        bConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/confirm-button.png")));
        bConfirmar.setBounds(1600, 420, 160, 80);
        bConfirmar.setContentAreaFilled(false);
        bConfirmar.setBorderPainted(false);
        bConfirmar.setFocusable(false);
        bConfirmar.addActionListener(this);
        body.add(bConfirmar);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
