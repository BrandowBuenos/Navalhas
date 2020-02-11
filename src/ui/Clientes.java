package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Customer Screen
 */

public class Clientes extends JPanel implements ActionListener {
    
    private JButton bVoltar;

    private JPanel description;
    private JLabel customerIcon;

    private JButton bAddCliente;
    private JButton bConsultarCliente;
    private JButton bEditarCliente;
    private JButton bExcluirCliente;

    
    public Clientes() {

        setBounds(65, 460, 1790, 200);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        bVoltar = new JButton("<");
        bVoltar.setBounds(WIDTH/6, HEIGHT/4, WIDTH/32, HEIGHT/24);
		bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
        bVoltar.setForeground(new Color(205, 92, 92));
        bVoltar.addActionListener(this);
        add(bVoltar);

        description = new JPanel();
        description.setBounds(0, 0, 246, 200);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-users.png")));
        customerIcon.setBounds(0, 50, 0, 0);
        description.add(customerIcon);

        bAddCliente = new JButton("\nAdicionar");
        bAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-add.png")));
        bAddCliente.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        bAddCliente.setForeground(new Color(0, 0, 0));
        bAddCliente.setBounds(350, 0, 300, 200);
        bAddCliente.setContentAreaFilled(false);
        bAddCliente.setBorderPainted(false);
        bAddCliente.setFocusable(false);
        bAddCliente.addActionListener(this);
        add(bAddCliente);

        bConsultarCliente = new JButton("\nConsultar");
        bConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-search.png")));
        bConsultarCliente.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        bConsultarCliente.setForeground(new Color(0, 0, 0));
        bConsultarCliente.setBounds(700, 0, 300, 200);
        bConsultarCliente.setContentAreaFilled(false);
        bConsultarCliente.setBorderPainted(false);
        bConsultarCliente.setFocusable(false);
        bConsultarCliente.addActionListener(this);
        add(bConsultarCliente);

        bEditarCliente = new JButton("\nEditar");
        bEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-edit.png")));
        bEditarCliente.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        bEditarCliente.setForeground(new Color(0, 0, 0));
        bEditarCliente.setBounds(1050, 0, 300, 200);
        bEditarCliente.setContentAreaFilled(false);
        bEditarCliente.setBorderPainted(false);
        bEditarCliente.setFocusable(false);
        bEditarCliente.addActionListener(this);
        add(bEditarCliente);

        bExcluirCliente = new JButton("\nExcluir");
        bExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/customer-delete.png")));
        bExcluirCliente.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        bExcluirCliente.setForeground(new Color(0, 0, 0));
        bExcluirCliente.setBounds(1200, 0, 300, 200);
        bExcluirCliente.setContentAreaFilled(false);
        bExcluirCliente.setBorderPainted(false);
        bExcluirCliente.setFocusable(false);
        bExcluirCliente.addActionListener(this);
        add(bExcluirCliente);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bVoltar) {
           
            Assinaturas ass = new Assinaturas();
            setVisible(false);
            Janela.panelInicio(ass);
            ass.setVisible(true);
        }

        if (ae.getSource() == bAddCliente) {

            AddClientes pAddCliente = new AddClientes();
            setVisible(false);
            Janela.panelInicio(pAddCliente);
            pAddCliente.setVisible(true);

        }

        if (ae.getSource() == bConsultarCliente) {

            ConsultarCliente conClientes = new ConsultarCliente();
            setVisible(false);
            Janela.panelInicio(conClientes);
            conClientes.setVisible(true);

        }

        if (ae.getSource() == bEditarCliente) {

            EditarClientes edtClientes = new EditarClientes();
            setVisible(false);
            Janela.panelInicio(edtClientes);
            edtClientes.setVisible(true);
        }

        if (ae.getSource() == bExcluirCliente) {

          
            ExcluirClientes excClientes = new ExcluirClientes();
            setVisible(false);
            Janela.panelInicio(excClientes);
            excClientes.setVisible(true);
        }

    }

}
