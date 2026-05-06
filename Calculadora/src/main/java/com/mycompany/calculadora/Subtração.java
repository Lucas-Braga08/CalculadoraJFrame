package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Subtração extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton subtrair;

    public Subtração() {
        super("Subtração");
        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        subtrair = new JButton("Subtrair");

        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        exibir.setBounds(50, 120, 200, 20);
        subtrair.setBounds(150, 100, 80, 20);

        subtrair.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int numero1, numero2, subtração;
                    subtração = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    subtração = numero1 - numero2;
                    exibir.setVisible(true);
                    exibir.setText("A subtração é: " + subtração);
                }
            }
        );

        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(subtrair);

        setSize(400, 250);
        setVisible(true);
    }
}
