package ui;

import java.awt.*;
import javax.swing.*;


/**
 * ExcluirClientes
 */
public class ExcluirClientes extends JPanel {

    private JPanel body;
    private JPanel description;
    private JLabel customerIcon;

    ExcluirClientes() {
        
        body = new JPanel();
        body.setBounds(65, 330, 1790,540);
        body.setBackground(new Color(255, 255, 255));
        body.setLayout(null);
        Janela.frame.getContentPane().add(body);



    }
    
}