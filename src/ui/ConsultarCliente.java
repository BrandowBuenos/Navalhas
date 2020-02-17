package ui;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;

import cliente.Cliente;
import cliente.ClienteDAO;

public class ConsultarCliente extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;

    private JLabel lClientes;
    private JLabel lConsultaNome;
    private JTextField tConsultaNome;
    private JButton bLimpar;
    private JButton bEnviar;
    private final int WIDTH = 1366;
    private final int HEIGHT = 768;

    private ClienteDAO clienteDAO = new ClienteDAO();

    ConsultarCliente() {
        setBounds(45, 182, 1275, 460);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        description = new JPanel();
        description.setBounds(0, 0, 175, 460);
        description.setBackground(new Color(234, 234, 234));
        description.setLayout(null);
        add(description);

        customerIcon = new JLabel("");
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-search.png")));
        customerIcon.setBounds(65, 196, 50, 45);
        description.add(customerIcon);

        lClientes = new JLabel("Consultar Cliente");
        lClientes.setBounds(WIDTH / 2 - WIDTH / 20, WIDTH / 14, WIDTH / 5, WIDTH / 32);
        lClientes.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        lClientes.setForeground(new Color(128, 128, 128));
        add(lClientes);

        lConsultaNome = new JLabel("Nome");
        lConsultaNome.setBounds(WIDTH / 2 - WIDTH / 5, HEIGHT / 5 + HEIGHT / 15, WIDTH / 5, HEIGHT / 27);
        lConsultaNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        lConsultaNome.setForeground(new Color(128, 128, 128));
        add(lConsultaNome);

        tConsultaNome = new JTextField();
        tConsultaNome.setBounds(WIDTH / 2 - WIDTH / 8, HEIGHT / 5 + HEIGHT / 15, WIDTH / 4 + WIDTH / 15, HEIGHT / 16);
        tConsultaNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        tConsultaNome.setForeground(new Color(131, 131, 131));
        // tConsultaCpf.setDocument(new Tratamento());
        add(tConsultaNome);

        bEnviar = new JButton("Consultar");
        bEnviar.setBounds(WIDTH / 2 + WIDTH / 40 + WIDTH / 32, HEIGHT / 3 + HEIGHT / 15, WIDTH / 10, HEIGHT / 16);
        bEnviar.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        bEnviar.addActionListener(this);
        bEnviar.setBackground(new Color(255, 255, 255));
        bEnviar.setForeground(new Color(0, 128, 128));
        add(bEnviar);

        bLimpar = new JButton("Limpar");
        bLimpar.setBounds(WIDTH / 3 + WIDTH / 12, HEIGHT / 3 + HEIGHT / 15, WIDTH / 10, HEIGHT / 16);
        bLimpar.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        bLimpar.setBackground(new Color(255, 255, 255));
        bLimpar.setForeground(new Color(205, 92, 92));
        bLimpar.addActionListener(this);
        add(bLimpar);

    }

    void resultadoConsulta() {

        description = new JPanel();
        description.setBounds(0, 0, 175, 460);
        description.setBackground(new Color(234, 234, 234));
        description.setLayout(null);
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-search.png")));
        customerIcon.setBounds(65, 196, 50, 45);
        description.add(customerIcon);

        JLabel label = new JLabel("Resultado da Pesquisa");
        label.setBounds(280, 220, 270, 22);
        label.setFont(new Font("Helvetica Neue", Font.PLAIN, 22));
        label.setForeground(new Color(131, 131, 131));
        add(label);

        JLabel line = new JLabel();
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/division-line.png")));
        line.setBounds(600, 80, 2, 328);
        add(line);

        JLabel bFoto = new JLabel();
        bFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/picture-customer.png")));
        bFoto.setBounds(865, 20, 100, 100);
               bFoto.setFocusable(false);
        add(bFoto);

        JLabel nome = new JLabel("Nome");
        nome.setBounds(730, 170, 80, 22);
        nome.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        nome.setForeground(new Color(131, 131, 131));
        add(nome);

        JLabel tNome = new JLabel("O nome da pessoa aqui");
        tNome.setBounds(730, 210, 320, 50);
        tNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        tNome.setForeground(new Color(47, 47, 47));
        add(tNome);

        JLabel contatos = new JLabel("Contatos");
        contatos.setBounds(730, 280, 120, 22);
        contatos.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        contatos.setForeground(new Color(131, 131, 131));
        add(contatos);

        JLabel tDDDContato1 = new JLabel("DDD 1 aqui");
        tDDDContato1.setBounds(730, 320, 65, 50);
        tDDDContato1.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        tDDDContato1.setForeground(new Color(47, 47, 47));
        add(tDDDContato1);

        JLabel tContato1 = new JLabel("Contato 1 aqui");
        tContato1.setBounds(810, 320, 240, 50);
        tContato1.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        tContato1.setForeground(new Color(47, 47, 47));
        add(tContato1);

        JLabel tDDDContato2 = new JLabel("DDD 2 aqui");
        tDDDContato2.setBounds(730, 375, 65, 50);
        tDDDContato2.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        tDDDContato2.setForeground(new Color(47, 47, 47));
        add(tDDDContato2);

        JLabel tContato2 = new JLabel("Contato 2 Aqui");
        tContato2.setBounds(810, 375, 240, 50);
        tContato2.setFont(new Font("Helvetica Neue", Font.PLAIN, 21));
        tContato2.setForeground(new Color(47, 47, 47));
        add(tContato2);

        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bEnviar) {
            
            
            removeAll();
            resultadoConsulta();
            
            String nomePesquisado = tConsultaNome.getText().trim();
            List<Cliente> listaClientes = clienteDAO.read();
            Cliente clientePesquisado = null;

            for (Cliente cliente : listaClientes) {
                String nomeCliente = cliente.getNome().trim();

                if (nomePesquisado.equalsIgnoreCase(nomeCliente)) {
                    clientePesquisado = cliente;
                }
            }

            if (clientePesquisado != null) {
                System.out.println(clientePesquisado.getContato1());
            } else {
                System.out.println("Cliente não encontrado");
            }
     }


        if (e.getSource() == bLimpar) {
            tConsultaNome.setText("");

        }

    }
}
