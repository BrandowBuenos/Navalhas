package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.List;

import cliente.Cliente;
import cliente.ClienteDAO;

/**
 * ExcluirClientes
 */
public class ExcluirClientes extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;

    private JLabel lClientes;
    private JLabel lConsultaNome;
    private JTextField tConsultaNome;

    private JButton bEnviar;
    private JButton bLimpar;
    private JButton bVoltar;

    private ClienteDAO clienteDAO = new ClienteDAO();
    private final int WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    

    ExcluirClientes() {

        setBounds(45, 182, 1275, 460);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        description = new JPanel();
        description.setLayout(null);
        description.setBounds(0, 0, 175, 460);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-delete.png")));
        customerIcon.setBounds(65, 196, 50, 45);
        description.add(customerIcon);

        lClientes = new JLabel("Excluir Cliente");
        lClientes.setBounds(WIDTH/2 - WIDTH/10, WIDTH/15, WIDTH/5, WIDTH/32);
		lClientes.setFont(new Font("Helvetica Neue", Font.PLAIN, 30));
        lClientes.setForeground(new Color(128, 128, 128));
        add(lClientes);

        lConsultaNome = new JLabel("Nome");
        lConsultaNome.setBounds(WIDTH/2 - WIDTH/4, HEIGHT/4, WIDTH/5, HEIGHT/27);
        lConsultaNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        lConsultaNome.setForeground(new Color(128, 128, 128));
        add(lConsultaNome);

        tConsultaNome = new JTextField("");
        tConsultaNome.setBounds(WIDTH/2 - WIDTH/6, HEIGHT/4, WIDTH/4 + WIDTH/35, HEIGHT/18);
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

        bEnviar = new JButton("Enviar");
        bEnviar.setBounds(WIDTH/3 + WIDTH/6, HEIGHT/3 + HEIGHT/15, WIDTH/11, HEIGHT/18);
		bEnviar.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        bEnviar.addActionListener(this);
        bEnviar.setBackground(new Color(255, 255, 255));
		bEnviar.setForeground(new Color(0, 128, 128));
        add(bEnviar);

        bLimpar = new JButton("Limpar");
        bLimpar.setBounds(WIDTH/3 + WIDTH/26, HEIGHT/3 + HEIGHT/15,WIDTH/11, HEIGHT/18);
        bLimpar.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        bLimpar.setBackground(new Color(255, 255, 255));
		bLimpar.setForeground(new Color(205, 92, 92));
        bLimpar.addActionListener(this);
        add(bLimpar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bEnviar) {
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
                clienteDAO.delete(clientePesquisado);
            } else {
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