package ru.mirea.task8.animation;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {
        framelist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame_0_delay-0.1s.gif").getImage());
        framelist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame_1_delay-0.1s.gif").getImage());
        framelist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame_2_delay-0.1s.gif").getImage());
        framelist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame_3_delay-0.1s.gif").getImage());
        framelist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame_4_delay-0.1s.gif").getImage());
        framelist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame_5_delay-0.1s.gif").getImage());
        framelist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame_6_delay-0.1s.gif").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 6; i++) {
                image = framelist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}