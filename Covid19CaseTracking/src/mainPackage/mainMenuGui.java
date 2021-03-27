//Imports the java swing and awt packages
package mainPackage;
import javax.swing.*;
import java.awt.*;

public class mainMenuGui {
    public static void startGui() {

        //Creating the Frame
        JFrame frame = new JFrame("Covid-19 Case Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Help");
        mb.add(m1);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel countryOneLabel = new JLabel("Enter country one here");
        JLabel countryTwoLabel = new JLabel("Enter country here");
        JTextField countryOneTextFeild = new JTextField(10); // accepts 10 characters
        JTextField countryTwoTextFeild = new JTextField(10); // accepts 10 characters
        JButton compareButton = new JButton("Compare Countries");
        JButton displayCountryData = new JButton("Display country one data");
        // Components added using Flow Layout
        panel.add(countryOneLabel);
        panel.add(countryTwoLabel);
        panel.add(countryOneTextFeild);
        panel.add(countryTwoTextFeild);
        panel.add(compareButton);
        panel.add(displayCountryData);


        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        //frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
