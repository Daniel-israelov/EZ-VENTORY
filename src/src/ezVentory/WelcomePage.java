package src.ezVentory;

import javax.swing.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel ("Hello");

    WelcomePage(){

        welcomeLabel.setBounds(0,0,200,35);

        frame.add((welcomeLabel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
