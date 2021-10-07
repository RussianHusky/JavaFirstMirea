package ru.mirea.task11.map;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map {
    private JPanel panelMain;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel centerPanel;
    private JPanel northPanel;
    private JPanel southPanel;

    public Map() {

        leftPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.print("WEST ");
                JOptionPane.showMessageDialog(null, "Democracy");
            }
        });
        rightPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                System.out.print("EAST ");
                JOptionPane.showMessageDialog(null, "Communism");
            }
        });
        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.print("CENTER ");
                JOptionPane.showMessageDialog(null, "Big city life");
            }
        });
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.print("NORTH ");
                JOptionPane.showMessageDialog(null, "Cold");
            }
        });
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.print("SOUTH ");
                JOptionPane.showMessageDialog(null, "Hot");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Map");
        frame.setContentPane(new Map().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
