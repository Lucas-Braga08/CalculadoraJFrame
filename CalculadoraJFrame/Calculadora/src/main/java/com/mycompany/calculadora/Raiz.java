package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Raiz extends JFrame {

    JLabel rotulo1, exibir;
    JTextField texto1;
    JButton calcular;

    public Raiz() {

        super("Raiz Quadrada");

        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("Número:");
        texto1 = new JTextField(5);
        exibir = new JLabel("");
        calcular = new JButton("Calcular");

        rotulo1.setBounds(50, 30, 100, 20);
        texto1.setBounds(120, 30, 100, 20);
        calcular.setBounds(120, 70, 100, 25);
        exibir.setBounds(50, 120, 250, 20);

        calcular.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    double numero, resultado;

                    numero = Double.parseDouble(texto1.getText());

                    resultado = Math.sqrt(numero);

                    exibir.setVisible(true);
                    exibir.setText("A raiz é: " + resultado);
                }
            }
        );

        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(texto1);
        tela.add(calcular);
        tela.add(exibir);

        setSize(350, 220);
        setVisible(true);
    }
}