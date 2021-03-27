//Imports the java swing and awt packages
package mainPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenuGui {
	private static String getCountryOne;
	private static String getCountryTwo;
	
	public String getCountryOne() {
		return mainMenuGui.getCountryOne;
	}
	public String getCountryTwo() {
		return mainMenuGui.getCountryTwo;
	}
	
    public static void startGui() {
    	
        //Creating the Frame
        JFrame frame = new JFrame("Covid-19 Case Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Help");
        mb.add(m1);
        
        //Creating a panel in the middle and adding components
        //JPanel middlePanel = new JPanel();
        
        //Creates country name
        //JLabel countryNameOne = new JLabel("Country: " + getCountryName);
        //JLabel countryNameTwo = new JLabel("Country: " + getCountryName);
        
        //Creates country 

        //Creating the panel at bottom and adding components
        JPanel bottomPanel = new JPanel(); // the panel is not visible in output
        JLabel countryOneLabel = new JLabel("Enter country one here");
        JLabel countryTwoLabel = new JLabel("Enter country two here");
        JTextField countryOneTextFeild = new JTextField(10); // accepts 10 characters
        JTextField countryTwoTextFeild = new JTextField(10); // accepts 10 characters
        JButton compareButton = new JButton("Compare Countries Case Data");
        JButton displayCountryData = new JButton("Display country data");
        
        // Components added using Flow Layout
        
        //Country one input
        bottomPanel.add(countryOneLabel);
        bottomPanel.add(countryOneTextFeild);
        
        //Country two input
        bottomPanel.add(countryTwoLabel);
        bottomPanel.add(countryTwoTextFeild);
        
        bottomPanel.add(compareButton);
        bottomPanel.add(displayCountryData);

        
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.setVisible(true);
       
        compareButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // MA - Using the class field myString to receive text from text area

                getCountryOne = countryOneTextFeild.getText();
                getCountryTwo = countryTwoTextFeild.getText();

                //editTextArea.setText(""); -> This will clear text after country data frame is closed. USE LATER

                //System.out.println(getCountryOne); --> TESTING
                //System.out.println(getCountryTwo);
                
            }
        });
      /*
        displayCountryData.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            	
                
            }
        });
      */
    }
}
