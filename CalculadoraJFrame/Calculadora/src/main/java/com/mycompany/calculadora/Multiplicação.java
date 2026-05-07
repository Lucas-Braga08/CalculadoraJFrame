package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Multiplicação extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton multiplicar;

    public Multiplicação() {
        super("Multiplicação");
        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        multiplicar = new JButton("Multiplicar");

        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        exibir.setBounds(50, 120, 200, 20);
        multiplicar.setBounds(150, 100, 80, 20);

        multiplicar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int numero1, numero2, multipla;
                    multipla = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    multipla = numero1 * numero2;
                    exibir.setVisible(true);
                    exibir.setText("A multiplicação é: " + multipla);
                }
            }
        );

        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(multiplicar);

        setSize(400, 250);
        setVisible(true);
    }
}
