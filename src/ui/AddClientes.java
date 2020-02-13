package ui;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import cliente.Cliente;
import cliente.ClienteDAO;

/**
 * Customer Screen
 */
public class AddClientes extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;

    private JButton bVoltar;
    private JButton bConfirmar;
    private JButton bFoto;

    private JTextField tNome;
    private JTextField tDDDContato1;
    private JTextField tContato1;
    private JTextField tDDDContato2;
    private JTextField tContato2;

    private JButton bBiometria;

    private final int WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public AddClientes() {

        setBounds(45, 182, 1275, 460);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        description = new JPanel();
        description.setBounds(0, 0, 175, 460);
        description.setBackground(new Color(234, 234, 234));
        description.setLayout(null);
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-add1.png")));
        customerIcon.setBounds(65, 196, 50, 45);
        description.add(customerIcon);

        bFoto = new JButton();
        bFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/picture-customer.png")));
        bFoto.setBounds(515, 20, 100, 100);
        bFoto.setContentAreaFilled(false);
        bFoto.setBorderPainted(false);
        bFoto.setFocusable(false);
        bFoto.addActionListener(this);
        add(bFoto);

        JLabel nome = new JLabel("Nome");
        nome.setBounds(400, 170, 80, 22);
        nome.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        nome.setForeground(new Color(131, 131, 131));
        add(nome);

        tNome = new JTextField("");
        tNome.setBounds(400, 210, 320, 50);
        tNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        tNome.setForeground(new Color(47, 47, 47));
        add(tNome);

        JLabel contatos = new JLabel("Contatos");
        contatos.setBounds(400, 280, 120, 22);
        contatos.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        contatos.setForeground(new Color(131, 131, 131));
        add(contatos);

        tDDDContato1 = new JTextField("");
        tDDDContato1.setBounds(400, 320, 65, 50);
        tDDDContato1.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        tDDDContato1.setForeground(new Color(47, 47, 47));
        add(tDDDContato1);

        tContato1 = new JTextField("");
        tContato1.setBounds(480, 320, 240, 50);
        tContato1.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        tContato1.setForeground(new Color(47, 47, 47));
        add(tContato1);

        tDDDContato2 = new JTextField("");
        tDDDContato2.setBounds(400, 385, 65, 50);
        tDDDContato2.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tDDDContato2.setForeground(new Color(47, 47, 47));
        add(tDDDContato2);

        tContato2 = new JTextField("");
        tContato2.setBounds(480, 385, 240, 50);
        tContato2.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tContato2.setForeground(new Color(47, 47, 47));
        add(tContato2);

        JLabel biometria = new JLabel("Biometria");
        biometria.setBounds(780, 170, 140, 22);
        biometria.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        biometria.setForeground(new Color(131, 131, 131));
        add(biometria);

        bBiometria = new JButton();
        bBiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/digital-button.png")));
        bBiometria.setBounds(780, 210, 180, 225);
        bBiometria.setContentAreaFilled(false);
        bBiometria.setBorderPainted(false);
        bBiometria.setFocusable(false);
        bBiometria.addActionListener(this);
        add(bBiometria);

        JButton bCancelar = new JButton();
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

        bVoltar = new JButton("<");
        bVoltar.setBounds(230, 50, 50, 50);
        bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
        bVoltar.setForeground(new Color(205, 92, 92));
        bVoltar.setBackground(new Color(255, 255, 255));
        bVoltar.addActionListener(this);
        add(bVoltar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bVoltar) {

            Clientes clientes = new Clientes();
            setVisible(false);
            Janela.panelInicio(clientes);
            clientes.setVisible(true);

        }

        if (e.getSource() == bFoto) {

            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Escolha uma foto para o perfil");

            if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                System.out.println(fc.getSelectedFile().toString());
                repaint();
            }
        }

        if (e.getSource() == bConfirmar) {

            try {
                Cliente novo_Cliente = new Cliente();
                novo_Cliente.setNome(tNome.getText().trim());
                novo_Cliente.setContato1(tDDDContato1.getText().trim() + " " + tContato1.getText());
                novo_Cliente.setContato2(tDDDContato2.getText().trim() + " " + tContato2.getText());

                ClienteDAO clienteDAO = new ClienteDAO();
                clienteDAO.create(novo_Cliente);

                setVisible(false);
                Clientes cliInterface = new Clientes();
                // Janela.frame.getContentPane().add(cliInterface);
                cliInterface.setVisible(true);
            } catch (Exception error) {
                System.out.println(error.getMessage());
            }
        }

    }

}
