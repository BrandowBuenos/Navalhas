package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Customer Screen
 */
public class Assinaturas extends JPanel implements ActionListener {

    private JPanel description;
    private JLabel customerIcon;

    private JButton bVoltar;

    private JTextField tPesquisa;
    private JButton bPesquisa;

    private JLabel lNome;
    private JLabel lContador;

    private JLabel line;

    private JPanel historico;

    private JLabel lProfilePicture;
    private JLabel lQtdServicos;
    private JLabel lQtdServicosGratis;


    private final int WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public Assinaturas() {

        setBounds(45, 182, 1275, 460);
        setBackground(new Color(255, 255, 255));
        setLayout(null);

        bVoltar = new JButton("<");
        bVoltar.setBounds(150, 50, 50, 50);
        bVoltar.setFont(new Font("Arial", Font.PLAIN, 20));
        bVoltar.setForeground(new Color(205, 92, 92));
        bVoltar.setBackground(new Color(255, 255, 255));
        bVoltar.addActionListener(this);
        add(bVoltar);


        description = new JPanel();
        description.setLayout(null);
        description.setBounds(0, 0, 175, 460);
        description.setBackground(new Color(234, 234, 234));
        add(description);

        customerIcon = new JLabel();
        customerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/signatures-icon.png")));
        customerIcon.setBounds(65, 196, 50, 45);
        description.add(customerIcon);

        tPesquisa = new JTextField("Pesquisa");
        tPesquisa.setBounds(WIDTH / 5, HEIGHT / 12, 384, 48);
        tPesquisa.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        tPesquisa.setForeground(new Color(90, 90, 90));
        tPesquisa.setBackground(new Color(252, 252, 252));
        tPesquisa.setHorizontalAlignment(JTextField.CENTER);
        tPesquisa.setBorder(new LineBorder(new Color(210, 210, 210)));
        add(tPesquisa);

        bPesquisa = new JButton("");
        bPesquisa.setBounds(WIDTH / 6, HEIGHT / 12, 65, 48);
        bPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/search-button.png")));
        bPesquisa.setBackground(new Color(234, 234, 234));
        bPesquisa.addActionListener(this);
        add(bPesquisa);

        lContador = new JLabel("09");
        lContador.setBounds(WIDTH / 6, HEIGHT / 5, 500, 24);
        lContador.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        lContador.setForeground(new Color(110, 110, 110));
        add(lContador);

        lNome = new JLabel("Vinicius Correia Martins");
        lNome.setBounds(WIDTH / 5, HEIGHT / 5, 500, 24);
        lNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 23));
        lNome.setForeground(new Color(47, 47, 47));
        add(lNome);

        line = new JLabel();
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/division-line.png")));
        line.setBounds(WIDTH / 3 + 200, HEIGHT / 20, 889, 328);
        add(line);

        historico = new JPanel();
        historico.setLayout(null);
        historico.setBounds(WIDTH / 2 - 119, 0, WIDTH / 2, WIDTH / 4);
        historico.setBackground(new Color(255, 255, 255));
        add(historico);

        lProfilePicture = new JLabel();
        lProfilePicture.setBounds(WIDTH / 20 - 20, HEIGHT / 18, 100, 100);
        lProfilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/profile-picture.png")));
        historico.add(lProfilePicture);

        lNome = new JLabel("Vinicius Correia Martins");
        lNome.setBounds(WIDTH / 9, HEIGHT / 18, 500, 25);
        lNome.setFont(new Font("Helvetica Neue", Font.PLAIN, 25));
        lNome.setForeground(new Color(47, 47, 47));
        historico.add(lNome);

        lQtdServicos = new JLabel("Quantidade de serviços: 29");
        lQtdServicos.setBounds(WIDTH / 9, HEIGHT / 11, 500, 26);
        lQtdServicos.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        lQtdServicos.setForeground(new Color(110, 110, 110));
        historico.add(lQtdServicos);

        lQtdServicosGratis = new JLabel("Quantidade de serviços grátis: 02");
        lQtdServicosGratis.setBounds(WIDTH / 9, HEIGHT / 9, 500, 26);
        lQtdServicosGratis.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        lQtdServicosGratis.setForeground(new Color(110, 110, 110));
        historico.add(lQtdServicosGratis);


        // Cards aqui

        Cards cards = new Cards();
        historico.add(cards.cardAdd(this));

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bVoltar) {
            
            AddAssinaturas addAss = new AddAssinaturas();
            setVisible(false);
            Janela.panelInicio(addAss);
            addAss.setVisible(true);

        }
        

    }

}
