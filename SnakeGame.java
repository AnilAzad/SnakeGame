
// package snakegame;
import java.awt.Color;

import javax.swing.JFrame;

public class SnakeGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setBounds(10, 10, 905, 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanal panal = new GamePanal();
        panal.setBackground(Color.DARK_GRAY);
        frame.add(panal);
        frame.setVisible(true);
    }
}