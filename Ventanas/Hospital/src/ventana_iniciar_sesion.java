import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

class ventana extends JFrame {
    public ventana() {
        JFrame frame = new JFrame("Raccoon Hospital | Iniciar Sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(900, 700);

        ImageIcon icon = new ImageIcon("C:/Users/ik012982i9/Desktop/logo_raccoon_sin_fondo.png");
        frame.setIconImage(icon.getImage());

        //panel contenedor
        GradientPanel containerPanel = new GradientPanel();
        containerPanel.setLayout(new BorderLayout());
        containerPanel.setBorder(new EmptyBorder(50, 50, 50, 50));
        frame.add(containerPanel);

        //paneles generales
        RoundedPanel panelgeneral = new RoundedPanel();
        panelgeneral.setLayout(new BoxLayout(panelgeneral, BoxLayout.Y_AXIS));
        panelgeneral.setBorder(new EmptyBorder(10, 10, 10, 10));
        containerPanel.add(panelgeneral);

        //paneles
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        panel3.setPreferredSize(new Dimension(0, 80));


        panelgeneral.add(panel1, BorderLayout.NORTH);
        panelgeneral.add(panel2, BorderLayout.CENTER);
        panelgeneral.add(panel3, BorderLayout.SOUTH);

        //paneles_2
        JPanel panel1_2 = new JPanel();

        //logo - Titulo
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints posicion = new GridBagConstraints();

        ImageIcon img1 = new ImageIcon("C:/Users/ik012982i9/Desktop/logo_raccoon_sin_fondo.png");
        Image image = img1.getImage();
        Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledImg1 = new ImageIcon(scaledImage);
        JLabel label1 = new JLabel(scaledImg1);
        posicion.gridx = 0;
        posicion.gridy = 0;
        panel1.add(label1, posicion);


        JLabel titulo = new JLabel("Iniciar Sesión");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        posicion.gridx = 0;
        posicion.gridy = 1;
        panel1.add(titulo, posicion);


        //usuario/contraseña
        //usuario
        posicion.insets = new Insets(0, 0, 30, 0); //agrega 10 píxeles de espacio arriba y abajo

        RoundedTextField textField = new RoundedTextField(20);
        textField.setBorder(null);
        textField.setText("    Usuario");
        textField.setFont(new Font("Arial", Font.PLAIN, 15));


        //quitar y poner el usuario
        textField.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                textField.setCaretPosition(0); // deselecciona el texto
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (textField.getText().equals("    Usuario")) {
                    textField.setText("");
                }
            }
        });
        textField.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText("    Usuario");
                }
            }
        });

        panel2.setLayout(new GridBagLayout());
        textField.setPreferredSize(new Dimension(0, 50));
        posicion.gridx = 0;
        posicion.gridy = 0;
        panel2.add(textField, posicion);


        //contra
        RoundedPassField passwordField = new RoundedPassField(20);
        passwordField.setBorder(null);
        passwordField.setText("    Contraseña");
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));

        // quitar y poner la contraseña
        passwordField.setEchoChar((char) 0); //muestra el texto en lugar de los caracteres

        passwordField.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                passwordField.setCaretPosition(0); // deselecciona el texto
            }
        });

        passwordField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (new String(passwordField.getPassword()).equals("    Contraseña")) {
                    passwordField.setEchoChar('*'); //restablece el carácter de eco
                    passwordField.setText("");
                }
            }
        });
        passwordField.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                if (new String(passwordField.getPassword()).isEmpty()) {
                    passwordField.setEchoChar((char) 0); //muestra el texto en lugar de los caracteres
                    passwordField.setText("    Contraseña");
                }
            }
        });

        passwordField.setPreferredSize(new Dimension(0, 50));
        posicion.gridx = 0;
        posicion.gridy = 1;
        panel2.add(passwordField, posicion);

        //botones
        //boton1
        JButton boton1 = new JButton ("Registrarse");
        boton1.setFocusPainted(false);
        boton1.setBorderPainted(false); //quitar borde
        boton1.setBackground(Color.WHITE); //color blanco
        boton1.setFont(new Font("Arial", Font.BOLD, 15));
        panel3.add(boton1);

        class ventana_registro implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame2 = new JFrame("Raccoon Hospital | Registrarse");
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.pack();
                        frame2.setSize(900, 700);
                        frame.setExtendedState(JFrame.ICONIFIED);


                        ImageIcon icon = new ImageIcon("C:/Users/ik012982i9/Desktop/logo_raccoon_sin_fondo.png");
                        frame2.setIconImage(icon.getImage());

                        //panel contenedor
                        GradientPanel containerPanel = new GradientPanel();
                        containerPanel.setLayout(new BorderLayout());
                        containerPanel.setBorder(new EmptyBorder(50, 50, 50, 50));
                        frame2.add(containerPanel);

                        //paneles generales
                        RoundedPanel panelgeneral = new RoundedPanel();
                        panelgeneral.setLayout(new BoxLayout(panelgeneral, BoxLayout.Y_AXIS));
                        panelgeneral.setBorder(new EmptyBorder(10, 10, 10, 10));
                        containerPanel.add(panelgeneral);

                        //paneles
                        JPanel panel1 = new JPanel();
                        JPanel panel2 = new JPanel();
                        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));

                        panel3.setPreferredSize(new Dimension(0, 80));


                        panelgeneral.add(panel1, BorderLayout.NORTH);
                        panelgeneral.add(panel2, BorderLayout.CENTER);
                        panelgeneral.add(panel3, BorderLayout.SOUTH);

                        //logo - Titulo
                        panel1.setLayout(new GridBagLayout());
                        GridBagConstraints posicion = new GridBagConstraints();

                        ImageIcon img1 = new ImageIcon("C:/Users/ik012982i9/Desktop/logo_raccoon_sin_fondo.png");
                        Image image = img1.getImage();
                        Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                        ImageIcon scaledImg1 = new ImageIcon(scaledImage);
                        JLabel label1 = new JLabel(scaledImg1);
                        posicion.gridx = 0;
                        posicion.gridy = 0;
                        panel1.add(label1, posicion);


                        JLabel titulo = new JLabel("Registrarse");
                        titulo.setFont(new Font("Arial", Font.BOLD, 30));
                        posicion.gridx = 0;
                        posicion.gridy = 1;
                        panel1.add(titulo, posicion);


                        //nombre/apellido/gmail/contraseña
                        //nombre

                        RoundedTextField textField = new RoundedTextField(20);
                        textField.setBorder(null);
                        textField.setText("    Nombre");
                        textField.setFont(new Font("Arial", Font.PLAIN, 15));


                        //quitar y poner el usuario
                        textField.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent e) {
                                textField.setCaretPosition(0); // deselecciona el texto
                            }
                        });

                        textField.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                if (textField.getText().equals("    Nombre")) {
                                    textField.setText("");
                                }
                            }
                        });
                        textField.addFocusListener(new FocusAdapter() {
                            public void focusLost(FocusEvent e) {
                                if (textField.getText().isEmpty()) {
                                    textField.setText("    Nombre");
                                }
                            }
                        });

                        panel2.setLayout(new GridBagLayout());
                        textField.setPreferredSize(new Dimension(0, 50));
                        posicion.gridx = 0;
                        posicion.gridy = 0;
                        posicion.insets = new Insets(0, 0, 30, 30); //agrega 10 píxeles de espacio arriba y abajo
                        panel2.add(textField, posicion);


                        //apellido
                        RoundedTextField textField2 = new RoundedTextField(20);
                        textField2.setBorder(null);
                        textField2.setText("    Apellido");
                        textField2.setFont(new Font("Arial", Font.PLAIN, 15));


                        //quitar y poner el usuario
                        textField2.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent e) {
                                textField2.setCaretPosition(0); // deselecciona el texto
                            }
                        });

                        textField2.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                if (textField2.getText().equals("    Apellido")) {
                                    textField2.setText("");
                                }
                            }
                        });
                        textField2.addFocusListener(new FocusAdapter() {
                            public void focusLost(FocusEvent e) {
                                if (textField2.getText().isEmpty()) {
                                    textField2.setText("    Apellido");
                                }
                            }
                        });

                        panel2.setLayout(new GridBagLayout());
                        textField2.setPreferredSize(new Dimension(0, 50));
                        posicion.gridx = 0;
                        posicion.gridy = 0;
                        posicion.insets = new Insets(0, 0, 30, 0); //agrega 10 píxeles de espacio arriba y abajo
                        panel2.add(textField2, posicion);


                        //gmail
                        RoundedTextField textField3 = new RoundedTextField(20);
                        textField3.setBorder(null);
                        textField3.setText("    Correo electronico");
                        textField3.setFont(new Font("Arial", Font.PLAIN, 15));


                        //quitar y poner el usuario
                        textField3.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent e) {
                                textField3.setCaretPosition(0); // deselecciona el texto
                            }
                        });

                        textField3.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                if (textField3.getText().equals("    Correo electronico")) {
                                    textField3.setText("");
                                }
                            }
                        });
                        textField3.addFocusListener(new FocusAdapter() {
                            public void focusLost(FocusEvent e) {
                                if (textField3.getText().isEmpty()) {
                                    textField3.setText("    Correo electronico");
                                }
                            }
                        });

                        panel2.setLayout(new GridBagLayout());
                        textField3.setPreferredSize(new Dimension(0, 50));
                        posicion.gridx = 0;
                        posicion.gridy = 0;
                        posicion.insets = new Insets(0, 0, 30, 0); //agrega 10 píxeles de espacio arriba y abajo
                        panel2.add(textField3, posicion);

                        //gmail
                        RoundedTextField textField4 = new RoundedTextField(20);
                        textField4.setBorder(null);
                        textField4.setText("    Telf");
                        textField4.setFont(new Font("Arial", Font.PLAIN, 15));


                        //quitar y poner el usuario
                        textField4.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent e) {
                                textField4.setCaretPosition(0); // deselecciona el texto
                            }
                        });

                        textField4.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                if (textField4.getText().equals("    Telf")) {
                                    textField4.setText("");
                                }
                            }
                        });
                        textField3.addFocusListener(new FocusAdapter() {
                            public void focusLost(FocusEvent e) {
                                if (textField4.getText().isEmpty()) {
                                    textField4.setText("    Telf");
                                }
                            }
                        });

                        panel2.setLayout(new GridBagLayout());
                        textField3.setPreferredSize(new Dimension(0, 50));
                        posicion.gridx = 0;
                        posicion.gridy = 1;
                        posicion.insets = new Insets(0, 0, 30, 0); //agrega 10 píxeles de espacio arriba y abajo
                        panel2.add(textField4, posicion);


                        //contra
                        RoundedPassField passwordField = new RoundedPassField(20);
                        passwordField.setBorder(null);
                        passwordField.setText("    Contraseña");
                        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));

                        // quitar y poner la contraseña
                        passwordField.setEchoChar((char) 0); //muestra el texto en lugar de los caracteres

                        passwordField.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent e) {
                                passwordField.setCaretPosition(0); // deselecciona el texto
                            }
                        });

                        passwordField.addKeyListener(new KeyAdapter() {
                            public void keyTyped(KeyEvent e) {
                                if (new String(passwordField.getPassword()).equals("    Contraseña")) {
                                    passwordField.setEchoChar('*'); //restablece el carácter de eco
                                    passwordField.setText("");
                                }
                            }
                        });
                        passwordField.addFocusListener(new FocusAdapter() {
                            public void focusLost(FocusEvent e) {
                                if (new String(passwordField.getPassword()).isEmpty()) {
                                    passwordField.setEchoChar((char) 0); //muestra el texto en lugar de los caracteres
                                    passwordField.setText("    Contraseña");
                                }
                            }
                        });

                        passwordField.setPreferredSize(new Dimension(0, 50));
                        posicion.gridx = 0;
                        posicion.gridy = 1;
                        panel2.add(passwordField, posicion);

                        //botones
                        //boton1
                        JButton boton1 = new JButton ("Registrarse");
                        boton1.setFocusPainted(false);
                        boton1.setBorderPainted(false); //quitar borde
                        boton1.setBackground(Color.WHITE); //color blanco
                        boton1.setFont(new Font("Arial", Font.BOLD, 15));
                        panel3.add(boton1);


                        frame2.setVisible(true);
                    }
                });
            }
        }

        boton1.addActionListener(new ventana_registro());

        //boton2
        JButton boton2 = new JButton ("Entrar como invitado");
        boton2.setFocusPainted(false);
        boton2.setBorderPainted(false); //quitar borde
        boton2.setBackground(Color.WHITE); //color blanco
        boton2.setFont(new Font("Arial", Font.BOLD, 15));
        panel3.add(boton2);
        frame.setVisible(true);

        //boton3
        JButton boton3 = new JButton ("Iniciar Sesión");
        boton3.setFocusPainted(false);
        boton3.setBorderPainted(false); //quitar borde
        boton3.setBackground(Color.WHITE); //color blanco
        boton3.setFont(new Font("Arial", Font.BOLD, 15));
        panel3.add(boton3);
        frame.setVisible(true);
    }
}