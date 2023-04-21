package org.example;

import org.example.RoundedButton;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

class ventana_principal extends JFrame {
    public ventana_principal() {
        JFrame frame = new JFrame("Raccoon Hospital | Citas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(900, 700);

        ImageIcon icon = new ImageIcon("C:/Users/ik012982i9/Desktop/logo_raccoon_sin_fondo.png");
        frame.setIconImage(icon.getImage());


        //paneles generales
        RoundedPanel panelgeneral = new RoundedPanel();
        panelgeneral.setLayout(new BoxLayout(panelgeneral, BoxLayout.Y_AXIS));
        panelgeneral.setBorder(new EmptyBorder(10, 10, 10, 10));
        frame.add(panelgeneral);

        //header
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        frame.add(header, BorderLayout.NORTH);
        header.setBackground(new Color(255, 81, 81));
        header.setPreferredSize(new Dimension(0, 60));

        //imagen header
        ImageIcon icon2 = new ImageIcon("C:/Users/ik012982i9/Desktop/logo_raccoon_sin_fondo.png");
        frame.setIconImage(icon2.getImage());

        //titulo header
        JLabel headerLabel = new JLabel("RACCOON HOSPITAL");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        header.add(headerLabel);
        header.add(Box.createHorizontalGlue());
        headerLabel.setForeground(new Color(255, 255, 255));

        //botones header
        RoundedButton button1 = new RoundedButton("Citas", 10);
        RoundedButton button2 = new RoundedButton("Historiales Medicos", 10);
        RoundedButton button3 = new RoundedButton("+", 10);

        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(110, 0)));
        header.add(button1);
        header.add(button2);
        header.add(button3);

        //panel de busqueda
        RoundedTextField input1 = new RoundedTextField(20);
        input1.setBorder(null);
        input1.setText("    Buscar...");
        input1.setFont(new Font("Arial", Font.PLAIN, 15));

                    // esto va en la parte de la carpeta de Listeners

                    /*input1.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            input1.setCaretPosition(0); // deselecciona el texto
                        }
                    });

                    input1.addKeyListener(new KeyAdapter() {
                        public void keyTyped(KeyEvent e) {
                            if (input1.getText().equals("    Buscar...")) {
                                input1.setText("");
                            }
                        }
                    });

                    input1.addFocusListener(new FocusAdapter() {
                        public void focusLost(FocusEvent e) {
                            if (input1.getText().isEmpty()) {
                                input1.setText("    Buscar...");
                            }
                        }
                    }); */

                    // esto va en la parte de la carpeta de Listeners
        header.add(button3);

        frame.setVisible(true);
    }
}
