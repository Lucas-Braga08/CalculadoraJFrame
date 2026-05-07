package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    JButton soma, sub, mult, div, raiz;
    JLabel titulo;

    public Menu() {

        super("Calculadora");

        Container tela = getContentPane();
        tela.setLayout(null);
        tela.setBackground(new Color(240, 240, 240));

        titulo = new JLabel("Escolha a operação", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(0, 20, 350, 30);

        soma = new JButton("Soma");
        sub = new JButton("Subtração");
        mult = new JButton("Multiplicação");
        div = new JButton("Divisão");
        raiz = new JButton("Raiz");

        soma.setBounds(90, 80, 150, 30);
        sub.setBounds(90, 120, 150, 30);
        mult.setBounds(90, 160, 150, 30);
        div.setBounds(90, 200, 150, 30);
        raiz.setBounds(90, 240, 150, 30);
        Font fonteBotao = new Font("Arial", Font.PLAIN, 14);

        soma.setFont(fonteBotao);
        sub.setFont(fonteBotao);
        mult.setFont(fonteBotao);
        div.setFont(fonteBotao);
        raiz.setFont(fonteBotao);

        tela.add(titulo);

        tela.add(soma);
        tela.add(sub);
        tela.add(mult);
        tela.add(div);
        tela.add(raiz);

        soma.addActionListener(e -> new Soma());
        sub.addActionListener(e -> new Subtração());
        mult.addActionListener(e -> new Multiplicação());
        div.addActionListener(e -> new Divisão());
        raiz.addActionListener(e -> new Raiz());

        setSize(350, 370);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}