package gui;
import javax.swing.*;

//import mainPackage.Main;

import java.awt.*;
public class MainMenu {
    public static void startGui() {

        //Creating the Frame
        JFrame frame = new JFrame("Covid-19 Case Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Help");
        mb.add(m1);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Database Address");
        JTextField databaseTf = new JTextField(10); // accepts up-to 10 characters
        JButton openDatabase = new JButton("Open Database Link");
        JButton openFile = new JButton("Open File");
        panel.add(label); // Components Added using Flow Layout
        panel.add(databaseTf);
        panel.add(openDatabase);
        panel.add(openFile);

        // Text Area at the Center
        //JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        //frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
