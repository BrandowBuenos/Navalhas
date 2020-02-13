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
    private JButton bVoltar;
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
        lClientes.setBounds(WIDTH/2 - WIDTH/20, WIDTH/14, WIDTH/5, WIDTH/32);
		lClientes.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        lClientes.setForeground(new Color(128, 128, 128));
        add(lClientes);

        lConsultaNome = new JLabel("Nome");
        lConsultaNome.setBounds(WIDTH/2 - WIDTH/5, HEIGHT/5 + HEIGHT/15, WIDTH/5, HEIGHT/27);
		lConsultaNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        lConsultaNome.setForeground(new Color(128, 128, 128));
        add(lConsultaNome);

        tConsultaNome = new JTextField();
        tConsultaNome.setBounds(WIDTH/2 - WIDTH/8, HEIGHT/5 + HEIGHT/15, WIDTH/4 + WIDTH/15, HEIGHT/16);
        tConsultaNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        tConsultaNome.setForeground(new Color(131, 131, 131));
        // tConsultaCpf.setDocument(new Tratamento());
        add(tConsultaNome);
 
        bVoltar = new JButton("<");
        bVoltar.setBounds(230, 50, 50, 50);
        bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
        bVoltar.setForeground(new Color(205, 92, 92));
        bVoltar.setBackground(new Color(255, 255, 255));
        bVoltar.addActionListener(this);
        add(bVoltar);

        bEnviar = new JButton("Consultar");
        bEnviar.setBounds(WIDTH/2 + WIDTH/40 + WIDTH/32, HEIGHT/3 + HEIGHT/15, WIDTH/10, HEIGHT/16);
		bEnviar.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        bEnviar.addActionListener(this);
        bEnviar.setBackground(new Color(255, 255, 255));
		bEnviar.setForeground(new Color(0, 128, 128));
        add(bEnviar);

        bLimpar = new JButton("Limpar");
        bLimpar.setBounds(WIDTH/3 + WIDTH/12, HEIGHT/3 + HEIGHT/15,WIDTH/10, HEIGHT/16);
        bLimpar.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        bLimpar.setBackground(new Color(255, 255, 255));
		bLimpar.setForeground(new Color(205, 92, 92));
        bLimpar.addActionListener(this);
        add(bLimpar);

    }

    void resultadoConsulta() {

        JButton bFoto = new JButton();
        bFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/picture-customer.png")));
        bFoto.setBounds(770, 40, 120, 120);
        bFoto.setContentAreaFilled(false);
        bFoto.setBorderPainted(false);
        bFoto.setFocusable(false);
        bFoto.addActionListener(this);
        add(bFoto);

        JLabel nome = new JLabel("Nome");
        nome.setBounds(600, 130, 200, 60);
        nome.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        nome.setForeground(new Color(131, 131, 131));
        add(nome);

        JTextField tNome = new JTextField("");
        tNome.setBounds(600, 200, 448, 60);
        tNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tNome.setForeground(new Color(47, 47, 47));
        add(tNome);

        JLabel contatos = new JLabel("Contatos");
        contatos.setBounds(600, 270, 200, 60);
        contatos.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        contatos.setForeground(new Color(131, 131, 131));
        add(contatos);

        JTextField tDDDContato1 = new JTextField("");
        tDDDContato1.setBounds(600, 350, 70, 60);
        tDDDContato1.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tDDDContato1.setForeground(new Color(47, 47, 47));
        add(tDDDContato1);

        JTextField tContato1 = new JTextField("");
        tContato1.setBounds(687, 350, 362, 60);
        tContato1.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tContato1.setForeground(new Color(47, 47, 47));
        add(tContato1);

        JTextField tDDDContato2 = new JTextField("");
        tDDDContato2.setBounds(600, 430, 70, 60);
        tDDDContato2.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tDDDContato2.setForeground(new Color(47, 47, 47));
        add(tDDDContato2);

        JTextField tContato2 = new JTextField("");
        tContato2.setBounds(687, 430, 362, 60);
        tContato2.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tContato2.setForeground(new Color(47, 47, 47));
        add(tContato2);

        JButton bCancelar = new JButton();
        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/cancel-button.png")));
        bCancelar.setBounds(1520, 420, 80, 80);
        bCancelar.setContentAreaFilled(false);
        bCancelar.setBorderPainted(false);
        bCancelar.setFocusable(false);
        bCancelar.addActionListener(this);
        add(bCancelar);

        JButton bConfirmar = new JButton();
        bConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/confirm-button.png")));
        bConfirmar.setBounds(1600, 420, 160, 80);
        bConfirmar.setContentAreaFilled(false);
        bConfirmar.setBorderPainted(false);
        bConfirmar.setFocusable(false);
        bConfirmar.addActionListener(this);
        add(bConfirmar);

        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bEnviar) {
            String nomePesquisado =tConsultaNome.getText().trim();
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
            }else{
                System.out.println("Cliente nao encontrado");
            }
        }

        if (e.getSource() == bLimpar) {
            tConsultaNome.setText("");

        }

        if (e.getSource() == bVoltar) {

            Clientes clientes = new Clientes();
            setVisible(false);
            Janela.panelInicio(clientes);
            clientes.setVisible(true);
        }
    }
}
