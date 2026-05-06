package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu extends JFrame {
    JButton soma, sub, mult, div, raiz;

    public Menu() {
        super("Menu de Operações");
        Container tela = getContentPane();
        setLayout(null);

        soma = new JButton("Soma");
        sub = new JButton("Subtração");
        mult = new JButton("Multiplicação");
        div = new JButton("Divisão");
        raiz = new JButton("Raiz");

        soma.setBounds(100, 30, 150, 25);
        sub.setBounds(100, 70, 150, 25);
        mult.setBounds(100, 110, 150, 25);
        div.setBounds(100, 150, 150, 25);
        raiz.setBounds(100, 190, 150, 25);

        tela.add(soma);
        tela.add(sub);
        tela.add(mult);
        tela.add(div);
        tela.add(raiz);

        soma.addActionListener(e -> new Soma());
        sub.addActionListener(e -> new Subtração());
        mult.addActionListener(e -> new Multiplicação());
        div.addActionListener(e -> new Divisão());

        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
