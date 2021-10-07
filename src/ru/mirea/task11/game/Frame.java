package ru.mirea.task11.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{
    int count = 0;
    int hiddenNumber = (int) (Math.random() * 10);

    JButton play = new JButton("Guess!");
    JTextField number = new JTextField(2);
    JLabel message = new JLabel("Input your guess");

    public Frame() {
        super("Guess the number");

        setLayout(null);
        setSize(400, 300);
        Font font = new Font("Comic Sans MS", Font.BOLD, 20);

        add(play);
        play.setBounds(150,  100, 100, 40);

        add(number);
        number.setBounds(165, 60, 70, 30);

        add(message);
        message.setVerticalAlignment(JLabel.CENTER);
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setBounds(100, 20, 200, 20);
        message.setFont(font);

        play.addMouseListener(new MouseListener() {

            public void mouseExited(MouseEvent a) {}

            public void mouseClicked(MouseEvent a) {
                try {
                    count++;
                    if (hiddenNumber == Integer.parseInt(number.getText()) && count <= 3) {
                        JOptionPane.showMessageDialog(null, "The random number: " + hiddenNumber + "\nYou won!");
                    } else if (count < 3 && hiddenNumber > Integer.parseInt(number.getText())) {
                        JOptionPane.showMessageDialog(null, "The random number is bigger");
                    } else if (count < 3 && hiddenNumber < Integer.parseInt(number.getText())) {
                        JOptionPane.showMessageDialog(null, "The random number is smaller");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "The random number: " + hiddenNumber + "\nYou lost!");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Input your guess!");
                }
            }

            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        System.out.print("Ophiget' rabotaet!!!");
        new Frame().setVisible(true);
    }
}