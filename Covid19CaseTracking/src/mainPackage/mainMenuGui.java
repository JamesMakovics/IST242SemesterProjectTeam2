//Imports the java swing and awt packages
package mainPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
        
        
        //Creating the panel at bottom and adding components
        JPanel bottomPanel = new JPanel(); // the panel is not visible in output
        JLabel countryOneLabel = new JLabel("Enter country one here:");
        JLabel countryTwoLabel = new JLabel("Enter country two here:");
        JTextField countryOneTextFeild = new JTextField(10); // accepts 10 characters
        JTextField countryTwoTextFeild = new JTextField(10); // accepts 10 characters
        JButton compareButton = new JButton("Compare Countries Case Data");
        
        // Components added using Flow Layout
        
        //Country one input
        bottomPanel.add(countryOneLabel);
        bottomPanel.add(countryOneTextFeild);
        
        //Country two input
        bottomPanel.add(countryTwoLabel);
        bottomPanel.add(countryTwoTextFeild);
        
        bottomPanel.add(compareButton);
        
        
       
        
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.setVisible(true);
       
        compareButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // MA - Using the class field myString to receive text from text area

               String getCountryOne = countryOneTextFeild.getText().toString();
               String getCountryTwo = countryTwoTextFeild.getText().toString();
              
               //Creates country output
               JPanel middlePanelNames = new JPanel();
               JLabel countryOneName = new JLabel("Country One: " + getCountryOne);
               JLabel countryTwoName = new JLabel("Country Two: " + getCountryTwo);
               middlePanelNames.add(countryOneName);
               middlePanelNames.add(countryTwoName);
               frame.getContentPane().add(BorderLayout.CENTER, middlePanelNames);
               frame.setVisible(true);
               
                getDataFromDatabase x = new getDataFromDatabase();
                getDataFromDatabase y = new getDataFromDatabase();
            	try {
            		x.getCountry(getCountryOne);
            		y.getCountry(getCountryTwo);
            		
            		//Creates the Panel and Labels for Cases
            		JPanel middlePanelNumCases = new JPanel();
                    JLabel countryOneNumCases = new JLabel("Number of Cases: " + x.getNumberofCases());
                    JLabel countryTwoNumCases = new JLabel("Number of Cases: " + y.getNumberofCases());
                    middlePanelNumCases.add(countryOneNumCases);
                    middlePanelNumCases.add(countryTwoNumCases);
                    frame.getContentPane().add(BorderLayout.CENTER, middlePanelNumCases);
                    
                  //Creates the Panel and Labels for recoveries
                    JPanel middlePanelRecovery = new JPanel();
                    JLabel countryOneRecovery = new JLabel("Recoveries: " + x.getRecovery());
                    JLabel countryTwoRecovery = new JLabel("Recoveries: " + y.getRecovery());
                    middlePanelRecovery.add(countryOneRecovery);
                    middlePanelRecovery.add(countryTwoRecovery);
                    frame.getContentPane().add(BorderLayout.CENTER, middlePanelRecovery);
                    
                  //Creates the Panel and Labels for deathes
                    JPanel middlePanelDeathes = new JPanel();
                    JLabel countryOneDeathes = new JLabel("Recoveries: " + x.getDeathes());
                    JLabel countryTwoDeathes = new JLabel("Recoveries: " + y.getDeathes());
                    middlePanelDeathes.add(countryOneDeathes);
                    middlePanelDeathes.add(countryTwoDeathes);
                    frame.getContentPane().add(BorderLayout.CENTER, middlePanelDeathes);
                    
                  //Creates the Panel and Labels for vaccinations
                    JPanel middlePanelVaccinations = new JPanel();
                    JLabel countryOneVaccinations = new JLabel("Recoveries: " + x.getRecovery());
                    JLabel countryTwoVaccinations = new JLabel("Recoveries: " + y.getRecovery());
                    middlePanelVaccinations.add(countryOneRecovery);
                    middlePanelVaccinations.add(countryTwoRecovery);
                    frame.getContentPane().add(BorderLayout.CENTER, middlePanelRecovery);
                    frame.setVisible(true);
            	} catch (ClassNotFoundException e1) {
            		
            		e1.printStackTrace();
            	} catch (SQLException e1) {
            		
            		e1.printStackTrace();
            	}

                //editTextArea.setText(""); -> This will clear text after country data frame is closed. USE LATER

                //System.out.println(getCountryOne); --> TESTING
                //System.out.println(getCountryTwo);
                
            }
        });
        
        
        //Creates country name
        //JLabel countryNameOne = new JLabel("Country: " + getCountryOne);
        //JLabel countryNameTwo = new JLabel("Country: " + getCountryTwo);

        
      /*
        displayCountryData.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            	
                
            }
        });
      */
    }
}
