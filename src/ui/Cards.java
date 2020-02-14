package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * cards
 */
public class Cards extends JPanel implements ActionListener{


    private JLabel statusIcon;

    private JButton addButton;

    private JLabel dateIcon;
    private JLabel date;

    private final int WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    Assinaturas ass;

    JPanel cardConfirmado() {

        setLayout(null);
        setBackground(new Color(245, 245, 245));
        setBounds(WIDTH / 20 - 20, HEIGHT / 4 - 20, 150, 150);

        JLabel statusIcon = new JLabel();
        statusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/confirm-icon.png")));
        statusIcon.setBounds(WIDTH - WIDTH + 115, HEIGHT - HEIGHT + 15, 22, 22);
        add(statusIcon);

        JLabel dateIcon = new JLabel();
        dateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/calendar-icon.png")));
        dateIcon.setBounds(WIDTH - WIDTH + 65, HEIGHT - HEIGHT + 30, 25, 25);
        add(dateIcon);

        JLabel date = new JLabel("02/01/2020");
        date.setBounds(WIDTH - WIDTH + 30, HEIGHT - HEIGHT + 80, 200, 25);
        date.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        add(date);

        return this;
    }

    JPanel cardUndo() {

        setLayout(null);
        setBounds(WIDTH / 20 + 140, HEIGHT / 4 - 20, 150, 150);
        setBackground(new Color(245, 245, 245));

        statusIcon = new JLabel();
        statusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/undo-icon.png")));
        statusIcon.setBounds(WIDTH - WIDTH + 115, HEIGHT - HEIGHT + 15, 22, 22);
        add(statusIcon);

        dateIcon = new JLabel();
        dateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/calendar-icon.png")));
        dateIcon.setBounds(WIDTH - WIDTH + 65, HEIGHT - HEIGHT + 30, 25, 25);
        add(dateIcon);

        date = new JLabel("16/01/2020");
        date.setBounds(WIDTH - WIDTH + 30, HEIGHT - HEIGHT + 80, 200, 25);
        date.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        add(date);

        return this;
    }

    /* Quadrado de adicionar */

    JPanel cardAdd(JPanel panel) {

        setLayout(null);
        setBounds(WIDTH / 10, HEIGHT / 4 - 20, 100, 100);

        addButton = new JButton();
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons/add-icon.png")));
        addButton.setBounds(0 , 0,100, 100);
        addButton.setBorderPainted(false);
        addButton.setFocusPainted(false);
        addButton.setBackground(new Color(234, 234, 234));
        addButton.setForeground(new Color(234, 234, 234));
        add(addButton);
        addButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel.setVisible(false);
                AddAssinaturas addAssinaturas = new AddAssinaturas();
                Janela.panelInicio(addAssinaturas);
                addAssinaturas.setVisible(true);
            }
        });

        return this;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {

            AddAssinaturas addAssinaturas = new AddAssinaturas();
            ass.setVisible(false);
            Janela.panelInicio(addAssinaturas);
            addAssinaturas.setVisible(true);
        }

    }

}