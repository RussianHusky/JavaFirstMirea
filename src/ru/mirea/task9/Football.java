package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Football extends JFrame
{
    int madrid = 0;
    int milan = 0;
    private JButton buttonMil = new JButton("AC Milan");
    private JButton buttonMad = new JButton("Real Madrid");
    private JLabel labelRes = new JLabel("Результат: "+madrid+" X "+milan);
    private JLabel labelLast = new JLabel("Последний счёт: N/A");
    private JLabel labelWin = new JLabel("Победитель: Ничья");


    public Football()
    {
        super("Football");
        this.setBounds(200,200,600,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,3,2,2));
        container.add(labelLast);
        container.add(labelWin);
        container.add(labelRes);
        container.add(buttonMad);
        container.add(buttonMil);

        buttonMad.addActionListener(new ButtonMadListener());
        buttonMil.addActionListener(new ButtonMilListener());

    }

    public class ButtonMadListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            madrid += 1;
            labelRes.setText("Результат: "+madrid+" X "+milan);
            labelLast.setText("Последний забивший: Madrid");
            if (madrid > milan)
                labelWin.setText("Победитель: Madrid");
            else if (milan > madrid)
                labelWin.setText("Победитель: Milan");
            else
                labelWin.setText("Победитель: Ничья");
        }
    }

    public class ButtonMilListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            milan += 1;
            labelRes.setText("Результат: "+madrid+" X "+milan);
            labelLast.setText("Последний забивший: Milan");
            if (madrid > milan)
                labelWin.setText("Победитель: Madrid");
            else if (milan > madrid)
                labelWin.setText("Победитель: Milan");
            else
                labelWin.setText("Победтель: Ничья");
        }
    }
}